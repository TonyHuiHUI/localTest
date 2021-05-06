

import kafka.api.OffsetRequest;
import kafka.api.PartitionOffsetRequestInfo;
import kafka.cluster.Broker;
import kafka.common.TopicAndPartition;
import kafka.javaapi.*;
import kafka.javaapi.consumer.SimpleConsumer;

import java.util.*;

/**
 * @author hui
 * 2019/8/7 0007 14:45
 */
public class KafkaLogSize {
        public static Long getLogSize(String host, int port, String topic, int partition) {
        String clientName = "client_" + topic + "_" + partition;
        Broker broker = getBroker(host, port, topic, partition);
        String partitionHost = null;
        if (broker != null) {
            partitionHost = broker.host();
        } else {
            System.out.println("partition of host isn't found");
        }
        SimpleConsumer consumer = new SimpleConsumer(partitionHost, port, 10000, 64 * 1024, clientName);
        TopicAndPartition topicAndPartition = new TopicAndPartition(topic, partition);
        Map<TopicAndPartition, PartitionOffsetRequestInfo> requestInfoMap = new HashMap<TopicAndPartition, PartitionOffsetRequestInfo>(16);
        requestInfoMap.put(topicAndPartition, new PartitionOffsetRequestInfo(OffsetRequest.LatestTime(), 1));
        kafka.javaapi.OffsetRequest request = new kafka.javaapi.OffsetRequest(requestInfoMap, OffsetRequest.CurrentVersion(), clientName);
        OffsetResponse response = consumer.getOffsetsBefore(request);
        if (response.hasError()) {
            System.out.println("Error fetching data Offset , Reason: " + response.errorCode(topic, partition));
            return 0L;
        }
        long[] offsets = response.offsets(topic, partition);
        return offsets[0];
    }

    public static Integer getBrokerId(String host, int port, String topic, int partition) {
        Broker leaderBroker = getBroker(host, port, topic, partition);
        if (leaderBroker != null) {
            return leaderBroker.id();
        }
        return null;
    }

    public static Broker getBroker(String host, int port, String topic, int partition) {
        String clientName = "client_search_broker";
        PartitionMetadata partitionMetadata = null;
        SimpleConsumer consumer = new SimpleConsumer(host, port, 10000, 64 * 1024, clientName);
        List<String> topics = new ArrayList<String>();
        topics.add(topic);
        TopicMetadataRequest request = new TopicMetadataRequest(topics);
        TopicMetadataResponse response = consumer.send(request);
        List<TopicMetadata> topicMetadataList = response.topicsMetadata();
        for (TopicMetadata topicMetadata : topicMetadataList) {
            for (PartitionMetadata metadata : topicMetadata.partitionsMetadata()) {
                if (metadata.partitionId() == partition) {
                    partitionMetadata = metadata;
                }
            }
        }
        if (partitionMetadata != null) {
            return partitionMetadata.leader();
        }
        return null;
    }
}
