import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author hui
 * @date 2018/11/26 0026 17:59
 */
public class ConsistentHashingTest {


    private static String[] servers = {"192.168.10.131","192.168.10.130","192.168.20.101","192.168.20.102","192.168.10.138 "};

    //key:hash值 value:服务器名
    private static List<String> realServer= new LinkedList<>();

    private static SortedMap<Integer, String> virtualHashCircle = new TreeMap<>();

    //虚拟节点与实际节点的倍数
    private static int multiple = 160;

    public static void main(String[] args) {
        String[] nodes = { "127.0.0.1", "192.168.10.131", "102.211.0.122" , "238.226.0.1", "221.211.0.122"};

        createCircle();

        for (String node : nodes) {
            System.out.println(node + "的hash值：" + getHash(node)+ " 选择的服务器节点：" + getServer(node));
        }
    }

    private static void createCircle(){
        for (String server : servers) {
            realServer.add(server);
            for(int i = 0; i < multiple; i++){
                String virtualServer = server + "#" + i;
                int virtualHash = getHash(virtualServer);
                System.out.println("服务器节点 " + virtualServer + "的hash值为 ：" + virtualHash + " 加入到hash环中");
                virtualHashCircle.put(virtualHash, virtualServer);
            }
        }

    }

    private static String getServer(String request) {
        int hash = getHash(request);
        SortedMap<Integer, String> subMap = virtualHashCircle.tailMap(hash);
        if(subMap.isEmpty()) {
            return virtualHashCircle.get(virtualHashCircle.firstKey()).split("#")[0];
        }
        Integer target = subMap.firstKey();
        return subMap.get(target).split("#")[0];
    }
    //FNV1_32_HASH算法1
    private static int getHash(String str) {
        final int p = 16777619;
        int hash = (int) 2166136261L;
        for (int i = 0; i < str.length(); i++) {
            hash = (hash ^ str.charAt(i)) * p;
        }
        hash += hash << 13;
        hash ^= hash >> 7;
        hash += hash << 3;
        hash ^= hash >> 17;
        hash += hash << 5;
        // 如果算出来的值为负数则取其绝对值
        if (hash < 0) {
            hash = Math.abs(hash);
        }
        return hash;
    }

}
