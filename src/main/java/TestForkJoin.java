import org.junit.Test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

/**
 * @author hui
 * 2021/3/29 0029 18:00
 */
public class TestForkJoin {
    @Test
    public void test1(){
        long start = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoinTest(0L,10000000000L);
        long sum = pool.invoke(task);
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println("test1耗时: "+(end - start));
    }
    @Test
    public void test2(){
        long start = System.currentTimeMillis();
        long sum = 0L;
        for (long i = 0L; i <= 10000000000L; i++) {
            sum += i;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println("test2耗时: " + (end - start));
    }
    @Test
    public void test3() {
        long start = System.currentTimeMillis();
        Long sum = LongStream.rangeClosed(0L, 10000000000L).parallel().sum();
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println("test2耗时: " + (end - start));

    }
}
