import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hui
 * @date 2018/9/20 0020 10:11
 */
public class Binary {

    public static void test1(int num){
        int count = 0;
        int key = 1;
        while (key > 0){
            if ((key & num)!=0){
                count++;
            }
            key = key<<1;
        }
        System.out.println("count : "+ count);
    }

    public static void test2(int num){
        int count = 0;
        while (num > 0){
            count++;
            num = num & (num -1);
        }
        System.out.println("count : "+ count);
    }

    public static void main(String[] args) {
/*        int num = 255;
*//*        test1(num);
        test2(num);*//*

        Integer.bitCount(num);

        int s1 = (num & 0x0f0f0f0f) + ((num >>> 4) & 0x0f0f0f0f);
        int s2 = (num  + (num >>> 4)) & 0x0f0f0f0f;
        System.out.println("s1 :"+ s1);
        System.out.println("s2 :"+ s2);*/
        Map<String,String> test = new ConcurrentHashMap<>(16);
        test.put("123","123");
        StringBuilder stringBuilder = new StringBuilder().append(test.get("123"));
        System.out.println(stringBuilder.toString());
        StringBuilder sb = new StringBuilder().append(test.get("456"));
        System.out.println(sb);
    }
}
