import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class Main {
    private static Random rand = new Random();
    private static long t = System.currentTimeMillis();
    static int getMoreData() {
        System.out.println("begin to start compute");
        try {
            Thread.sleep(1000);
            throw new RuntimeException();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws Exception{
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(Main::getMoreData);
/*
        future.exceptionally(ex -> {
            System.out.println("exception :" + ex);
            return 0;
        }).thenRun(()->{
            System.out.println("exceptionally thenrun");
        });
*/

        Future<Integer> f = future.whenComplete((v, e) -> {
            System.out.println("value :" + v);
            System.out.println("exception :"+ e);

        });
        System.out.println("resule ：" + f.get());
        System.in.read();
    }
}