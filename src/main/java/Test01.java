import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hui
 * @date 2018/8/17 0017 15:21
 */
public class Test01 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        char cursorChar = 13;

        System.out.println("                                                      cursorChar: "+ (int)cursorChar);
        System.out.println("                                                  1L<<cursorChar: "+ (1L<<cursorChar));
        System.out.println("                                           (cursorChar - 64)>>31: "+((cursorChar - 64)>>31));
        System.out.println("                              Integer.toHexString(1<<cursorChar): "+Integer.toHexString(1<<cursorChar));
        System.out.println("                      Integer.toHexString((cursorChar - 64)>>31):"+Integer.toHexString((cursorChar - 64)>>31));
        System.out.println("Long.toHexString((1L << cursorChar) & ((cursorChar - 64) >> 31)): "+Long.toHexString((1L << cursorChar) & ((cursorChar - 64) >> 31)));
        System.out.println("                                   Long.toHexString(4294977024L): "+Long.toHexString(4294977024L));
        System.out.println(" ((1L << cursorChar) & ((cursorChar - 64) >> 31) & 0x100002600L): "+((1L << cursorChar) & ((cursorChar - 64) >> 31) & 0x100002600L));


        SingleTon singleTon = SingleTon.getInstance();
        System.out.println(SingleTon.getCount1());
        System.out.println(SingleTon.getCount2());

        String str1 = "产生自定义日志告警，日志信息为: {\"logtime\":\"06-26 14:37:14 667\",\"threadPool\":\"dapeng-container-biz-pool-4\",\"level\":\"WARN\",\"sessionTid\":\"ac130004c6ad9bf3\",\"message\":\"module:[1] log_Level:[ERROR] log_type:[1] time:[1] client_info:[1] errInfo_callStack:[1] url:[1] ip:[10.100.62.154] request_address:[] request_take:[] err_location:[1]\",\"hostname\":\"10.100.62.154\",\"tag\":\"journalService\"}";

        String str2 = "产生自定义日志告警，日志信息为: {\"logtime\":\"06-26 14:32:55 586\",\"level\":\"INFO\",\"tag\":\"journalService\",\"sessionTid\":\"\",\"hostname\":\"10.100.62.154\",\"message\":\" ------------ SpringClassLoader: [com.github.dapeng.impl.container.DapengApplication@5c1bd44c]\",\"threadPool\":\"main\"}";

        Pattern pattern1 = Pattern.compile(".*\"sessionTid\":\"([^\"]*)\".*\"tag\":\"([^\"]*)\".*");
        Pattern pattern2 = Pattern.compile(".*\"tag\":\"([^\"]*)\".*\"sessionTid\":\"([^\"]*)\".*");

        Matcher m1 = pattern1.matcher(str1);
        if (m1.matches()){
            System.out.println("匹配: sessionTid = "+ m1.group(1)+ "\n tag = " + m1.group(2));
        }else {
            System.out.println("不匹配");
        }

        Matcher m2 = pattern2.matcher(str2);
        if (m2.matches()){
            System.out.println("匹配: sessionTid = "+ m2.group(2)+ "\n tag = " + m2.group(1));
        }else {
            System.out.println("不匹配");
        }



        StringBuilder sb = new StringBuilder("[").append("aaaaaaa").append(']');
        StringBuilder sb2 = new StringBuilder('[').append("aaaaaaa").append(']');

        System.out.println(sb);
        System.out.println(sb2);

        String str = " 产生自定义日志告警，日志信息为: {\"@timestamp\":1562922517.806593, \"logtime\":\"07-12 11:40:34 223\", \"threadPool\":\"nioEventLoopGroup-3-2\", \"level\":\"INFO\", \"message\":\"Channel\\u8fde\\u63a5\\u5173\\u95ed:[id: 0x8ae80647, L:/172.22.0.3:9096 ! R:/172.22.0.1:37440], \\u8fde\\u63a5\\u72b6\\u6001:0/2/2\", \"hostname\":\"192.168.4.221\", \"tag\":\"helloService\"}";
        byte[] bytes = str.getBytes("UTF-8");
        String news = new String(bytes);
        System.out.println(news);
        System.out.println(new String(news.getBytes("UTF-8")));


    }

}
