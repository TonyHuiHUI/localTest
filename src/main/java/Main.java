import sun.awt.windows.ThemeReader;

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
//        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(Main::getMoreData);
/*
        future.exceptionally(ex -> {
            System.out.println("exception :" + ex);
            return 0;
        }).thenRun(()->{
            System.out.println("exceptionally thenrun");
        });
*/
//
//        Future<Integer> f = future.whenComplete((v, e) -> {
//            System.out.println("value :" + v);
//            System.out.println("exception :"+ e);
//
//        });
//        System.out.println("resule ：" + f.get());
//        System.in.read();
//
        Thread thread = new Thread(()->{

            try {
                System.out.println("000000000000");
                Thread.sleep(10000);
                System.out.println("1111111111111111");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().isInterrupted());
                //System.out.println(Thread.interrupted());

                System.out.println(Thread.currentThread().getState());//interrupt---->Runnable
                System.out.println("2222222222222");
                Thread.currentThread().interrupt();
                System.out.println(Thread.currentThread().isInterrupted());
               // Thread.currentThread().run();//Runnable--->running
                //e.printStackTrace();
            }
        });
        thread.start();
        thread.interrupt();

//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().interrupt();
////        System.out.println(Thread.interrupted());
//        System.out.println(Thread.currentThread().isInterrupted());
//        System.out.println(Thread.currentThread().isInterrupted());
    }
}