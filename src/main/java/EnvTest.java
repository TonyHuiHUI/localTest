import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author hui
 * 2021/8/18 0018 17:15
 */
public class EnvTest {
    public static final String KEY_SOA_ZOO_KEEPER_HOST = "soa.zookeeper.host";
    public static void main(String[] args) {
        //System.getenv("soa.zookeeper.host");
        System.setProperty(KEY_SOA_ZOO_KEEPER_HOST, "192.168.4.111:2181");
        //SoaSystemEnvProperties.SOA_ZOOKEEPER_HOST

        System.out.println("[getZkHost] ==>System.getenv(soa.zookeeper.host)= "+ System.getenv("soa.zookeeper.host".replace('.', '_')));
        System.out.println("[getZkHost] ==>System.getProperty(KEY_SOA_ZOO_KEEPER_HOST) = " + System.getProperty(KEY_SOA_ZOO_KEEPER_HOST));
        List<String> list = new LinkedList<>();
        for(int i = 0; i < 30; i++){
            list.add("service" + i);
        }

        try {
            int processor = Runtime.getRuntime().availableProcessors() >= 4 ? Runtime.getRuntime().availableProcessors() : 4;
            ExecutorService executorService = Executors.newFixedThreadPool(processor);

            list.forEach(service ->{
                executorService.execute(() -> {
                    System.out.println("子线程---------" + service);
                    if(System.getenv(KEY_SOA_ZOO_KEEPER_HOST.replaceAll("\\.","_"))== null){
                        System.out.println("子线程--------------System.getProperty(KEY_SOA_ZOO_KEEPER_HOST)" + System.getProperty(KEY_SOA_ZOO_KEEPER_HOST, "127.0.0.1:2181"));
                    }
                });
            });
//            executorService.shutdownNow();
//            executorService.awaitTermination(1, TimeUnit.HOURS);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
