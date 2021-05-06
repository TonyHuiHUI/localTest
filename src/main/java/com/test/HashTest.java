package com.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import sun.security.util.AuthResources_it;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hui
 * 2019/8/19 0019 10:33
 */
public class HashTest {

    @Resource(name="tx_hello_dataSource")
    private static  DataSource dataSource;

    private static String URL = "jdbc:mysql://10.100.154.17:3348/td_store?useUnicode=true&characterEncoding=utf8";
    private static String USER = "dev_user";
    private static String PASSWORD ="GJbeuZBL9rp2Q9lfPinakTw6awBc70";

    @Value("#{${apiInfo}}")
    private Map<String, String> apiInfo;

    @Value("${kafka_topic}")
    String kafka_topic;

    public static void main(String[] args) throws SQLException {

        List<String> storeIDs = new ArrayList<>(16);
        Map<Integer, Integer> hashMap = new HashMap<>(16);
        Map<Integer, Integer> modMap = new HashMap<>(16);
        Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
        Statement statement = conn.createStatement();
        String sql = "select store_id from ts_stores";
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            storeIDs.add(resultSet.getString("store_id"));
        }
        for (String storeId : storeIDs) {
            int partition = storeId.hashCode() % 48;
            hashMap.merge(partition, 1, (a, b) -> a + b);
        }
        for (String storeId : storeIDs) {
            int partition = Integer.parseInt(storeId) % 48;
            modMap.merge(partition, 1, (a, b) -> a + b);
        }

        System.out.println("hash............");
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println("partition: " + entry.getKey() + " count: " + entry.getValue());
        }

        System.out.println("mod.............");
        for (Map.Entry<Integer, Integer> entry : modMap.entrySet()) {
            System.out.println("partition: " + entry.getKey() + " count: " + entry.getValue());
        }

        System.out.println(Integer.MAX_VALUE);

        Integer tmp = 214748300;

        Long tmp1 = 214748300000L;
        System.out.println(tmp1.hashCode());
    }
}
