import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @author hui
 * @date 2018/8/4 0004 14:49
 */
public class TestTimeStamp {

    private static int minInterval = 60;
    private static int midInterval = 3600;
    private static int maxInterval = 86400;
    private final static long BASE_TIME_MILLIS = 1533052800000L;


    public static void main(String[] args) {

        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);
        System.out.println(currentTime/1000);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date = new Date(currentTime/1000*1000);
        Date date1 = new Date(currentTime);

        System.out.println(formatter.format(date1));
        System.out.println(formatter.format(date));

        int now = (int) (((currentTime) / 1000) % 86400);
        System.out.println("currentTime "+ now );
        System.out.println("currentTime min "+ now / minInterval);
        System.out.println("currentTime mid "+ now / midInterval);
        System.out.println("currentTime max "+ now / maxInterval);

        System.out.println("----------------------------------");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.atZone(ZoneId.of("Asia/Shanghai")));

        long currentTimeNew = localDateTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(currentTimeNew/1000);

        int nowNew = (int) (((currentTimeNew) / 1000) % 86400);
        System.out.println("currentTimeNew "+ nowNew );
        System.out.println("currentTimeNew min "+ nowNew / minInterval);
        System.out.println("currentTimeNew mid "+ nowNew / midInterval);
        System.out.println("currentTimeNew max "+ nowNew / maxInterval);

        System.out.println("----------------------------------");

        LocalDateTime after1days = LocalDateTime.now().plus(1, ChronoUnit.DAYS);

        System.out.println("after 1 days:" + after1days);

        long currentTime2D = after1days.toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(currentTime2D/1000);

        int nowNew2D = (int) (((currentTime2D) / 1000) % 86400);
        System.out.println("currentTime2D "+ nowNew2D );
        System.out.println("currentTime2D min "+ nowNew2D / minInterval);
        System.out.println("currentTime2D mid "+ nowNew2D / midInterval);
        System.out.println("currentTime2D max "+ nowNew2D / maxInterval);

        System.out.println("----------------------------------------");

        int  currentTimeSecond = (int)((System.currentTimeMillis() - BASE_TIME_MILLIS)/1000);
        System.out.println(currentTimeSecond);
        Date date2 = new Date(currentTimeSecond * 1000 + BASE_TIME_MILLIS);
        System.out.println(formatter.format(date2));

        int now3 = currentTimeSecond % 86400;
        System.out.println("currentTime "+ now3 );
        System.out.println("currentTime min "+ (currentTimeSecond % 86400) / minInterval);
        System.out.println("currentTime mid "+ (currentTimeSecond % 86400) / midInterval);
        System.out.println("currentTime max "+ (currentTimeSecond / 86400));


        System.out.println("-*******************************************-");
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

    }

}
