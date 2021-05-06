import java.util.concurrent.atomic.AtomicInteger;


public class TestRandom {

    private static AtomicInteger roundRobinIndex = new AtomicInteger(8);

    public static  void main(String[] args){

        for (int i = 10; i >0; i--){
/*            final Random random = new Random();

            final int index = random.nextInt(10);

            System.out.println(index);*/

            roundRobinIndex = new AtomicInteger(roundRobinIndex.incrementAndGet() % 10);

            System.out.println(roundRobinIndex.get());
        }


    }

}
