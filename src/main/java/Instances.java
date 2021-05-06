import java.util.concurrent.atomic.AtomicInteger;

public class Instances {


    public AtomicInteger activeCount = new AtomicInteger(0);

/*
    public Instances(String service, String ip, int port, String version, String temp_seqid,int weight) {
        this.service = service;
        this.version = version;
        this.ip = ip;
        this.port = port;
        this.temp_seqid = temp_seqid;
        this.weight = weight;*/

    @Override
    public String toString() {
        return " " + activeCount;
    }

}

/*
package com.github.dapeng;

        import com.github.dapeng.core.RuntimeInstance;
        import com.github.dapeng.core.helper.SoaSystemEnvProperties;
        import org.junit.Test;

        import java.util.ArrayList;
        import java.util.List;

        import static com.github.dapeng.zookeeper.common.LoadBalanceAlgorithm.random;
        import static com.github.dapeng.zookeeper.common.LoadBalanceAlgorithm.roundRobin;

public class LoadBalanceTest {

    @Test
    public void randomTest(){
        List<RuntimeInstance> instances = new ArrayList<>();
        RuntimeInstance result = null;

        RuntimeInstance instance1 = new RuntimeInstance("serverce1", SoaSystemEnvProperties.SOA_CONTAINER_IP, SoaSystemEnvProperties.SOA_CONTAINER_PORT, "1.0.0", null,40);
        RuntimeInstance instance2 = new RuntimeInstance("serverce2", SoaSystemEnvProperties.SOA_CONTAINER_IP, SoaSystemEnvProperties.SOA_CONTAINER_PORT, "1.0.0", null,100);
        RuntimeInstance instance3 = new RuntimeInstance("serverce3", SoaSystemEnvProperties.SOA_CONTAINER_IP, SoaSystemEnvProperties.SOA_CONTAINER_PORT, "1.0.0", null,50);

        instances.add(instance1);
        instances.add(instance2);
        instances.add(instance3);

        for(int i = 0; i < 10; i++) {
            result = random(instances);
            System.out.println("service:" + result.service + " "+result + " weight:" + result.weight);
        }
    }

    @Test
    public void roundRobinTest(){
        List<RuntimeInstance> instances = new ArrayList<>();
        RuntimeInstance result = null;

        RuntimeInstance instance1 = new RuntimeInstance("serverce1", SoaSystemEnvProperties.SOA_CONTAINER_IP, SoaSystemEnvProperties.SOA_CONTAINER_PORT, "1.0.0", null,10);
        RuntimeInstance instance2 = new RuntimeInstance("serverce2", SoaSystemEnvProperties.SOA_CONTAINER_IP, SoaSystemEnvProperties.SOA_CONTAINER_PORT, "1.0.0", null,20);
        RuntimeInstance instance3 = new RuntimeInstance("serverce3", SoaSystemEnvProperties.SOA_CONTAINER_IP, SoaSystemEnvProperties.SOA_CONTAINER_PORT, "1.0.0", null,10);

        instances.add(instance1);
        instances.add(instance2);
        instances.add(instance3);

        for(int i = 0; i < 20; i++) {
            result = roundRobin(instances);
            System.out.println("service:" + result.service + " "+result + " weight:" + result.weight);
        }
    }

}*/

