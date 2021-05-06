/**
 * @author hui
 * 2019/6/25 0025 14:22
 */
public class SingleTon {
    private static SingleTon singleTon = new SingleTon();
    private static int count1;
    private static int count2 = 0;

    private SingleTon() {
        count1++;
        count2++;
    }

    public static SingleTon getInstance() {
        return singleTon;
    }

    public static int getCount1() {
        return count1;
    }

    public static int getCount2() {
        return count2;
    }
}
