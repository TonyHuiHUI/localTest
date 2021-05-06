package kafkaRebalanced;


import com.github.dapeng.core.InvocationContext;
import com.github.dapeng.core.InvocationContextImpl;
import com.github.dapeng.core.helper.DapengUtil;
import com.github.dapeng.core.helper.SoaSystemEnvProperties;
import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.ByteArrayDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author hui
 * 2020/1/9 0009 14:09
 */
public class TestConsumer implements Runnable {

    protected final Logger logger = LoggerFactory.getLogger(getClass());
    private Map<TopicPartition, OffsetAndMetadata> currentOffsets = new HashMap<>();

    private String topic;
    private String groupId;
    private String kafkaHost;
    private KafkaConsumer consumer;
    private volatile boolean isRunning;

    public TestConsumer(String topic, String groupId, String kafkaHost) {
        this.topic = topic;
        this.groupId = groupId;
        this.kafkaHost = kafkaHost;
        isRunning = true;
        init();
    }


    public void init() {
        KafkaConfigBuilder.ConsumerConfiguration builder = KafkaConfigBuilder.defaultConsumer();

        Properties props = builder.bootstrapServers(kafkaHost)
                .group(groupId)
                .withKeyDeserializer(StringDeserializer.class)
                .withValueDeserializer(StringDeserializer.class)
                .withOffsetCommitted(false)
                .excludeInternalTopic(false)
                .build();
        consumer = new KafkaConsumer<>(props);
    }

    @Override
    public void run() {
        System.out.println(this.groupId + ":" + this.topic);
        this.consumer.subscribe(Arrays.asList(this.topic), new ConsumerRebalanced());
        while (isRunning) {
            try {
                ConsumerRecords<String, String> records = consumer.poll(1000);
                if (records != null && records.count() > 0) {
                    System.out.println("[" + getClass().getSimpleName() + "] 每轮拉取消息数量,poll received : " + records.count() + " records");
                    // for process every message
                    for (ConsumerRecord<String, String> record : records) {
                        System.out.println("-----"+record.offset());
                        currentOffsets.put(new TopicPartition(record.topic(), record.partition()), new OffsetAndMetadata(record.offset() + 1, "no metadata"));
                        Thread.sleep(60000 * 6);
                        try {
                            //record每消费一条就提交一次(性能会低点)
                            consumer.commitSync(currentOffsets);
                        } catch (CommitFailedException e) {
                            System.out.println("commit failed,will break this for loop" + e);
                            break;
                        }
                    }
                }

            } catch (SerializationException ex) {
                System.out.println("kafka consumer poll 反序列化消息异常:" + ex.getMessage() + ex);
            } catch (Exception e) {
                System.out.println("[KafkaConsumer][{}][run] " + e.getMessage() + groupId + ":" + topic + e);
            } finally {
                MDC.remove(SoaSystemEnvProperties.KEY_LOGGER_SESSION_TID);
                InvocationContextImpl.Factory.removeCurrentInstance();
            }
        }
        consumer.close(10, TimeUnit.SECONDS);
        System.out.println("[{}]::kafka consumer stop running already!" + getClass().getSimpleName());
    }

    private class ConsumerRebalanced implements ConsumerRebalanceListener {

        @Override
        public void onPartitionsRevoked(Collection<TopicPartition> partitions) {
            System.out.println("rebalanced revoked 触发, partition被收回");
            partitions.forEach(p -> {
                long position = consumer.position(p);
                System.out.println("拉取偏移量信息: partition:{}, next offset position:{}"+ p + position);
                OffsetAndMetadata committed = consumer.committed(p);
                System.out.println("提交偏移量信息: {}"+ committed);
            });
            try {
                //record每消费一条就提交一次(性能会低点)
                consumer.commitSync(currentOffsets);
            } catch (CommitFailedException e) {
                System.out.println("commit failed,will break this for loop" + e);
            }
        }

        @Override
        public void onPartitionsAssigned(Collection<TopicPartition> partitions) {

        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new TestConsumer("hello_1.0.0_event", "hello_subscribe", "192.168.4.221:9092"));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
