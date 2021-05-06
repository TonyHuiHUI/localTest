import java.util.concurrent.atomic.AtomicInteger;

public class TestLeastAcTive {


    private static int lastSelected = -1;
    private static int currentWeight = 0;
    private static AtomicInteger roundRobinIndex = new AtomicInteger(-1);
    private static int currentIndex = -1;

    public static void main(String[] args){


/*        List<Integer> instances1 = new ArrayList<>(Arrays.asList(1,0,0,0,0,1,2,3,5,0,1,4,2,0));

        for (int i = 0; i < 100; i++) {
            if (instances1.size() > 0) {

                int index = 0;

                for (int j = 1; j < instances1.size(); j++) {
                    if (instances1.get(j) < instances1.get(index)) {
                        index = j;
                    }
                }
                instances1.set(index,instances1.get(index)+1);
                System.out.println(instances1);
            }
        }*/


/*        List<Integer> instances = new ArrayList<>(Arrays.asList(1,0,0,0,0,1,2,3,5,0,1,4,2,0));

        for (int j = 0; j < 100; j ++) {
            int length = instances.size();
            int leastCount = 0;
            int[] sameActive = new int[length];  //存储相同最小活跃实例的下标
            if (instances.size() > 0) {
                int index = 0;

                for (int i = 0; i < length; i++) {
                    if (instances.get(i) < instances.get(index)) {
                        leastCount = 1;
                        sameActive[0] = i;
                        index = i;
                    } else if (instances.get(i) == instances.get(index)) {
                        sameActive[leastCount++] = i;
                    }

                }

                final Random random = new Random();
                int a = sameActive[random.nextInt(leastCount)];
                instances.set(a,instances.get(a)+1);
                System.out.println(instances);
            }
        }*/

    /*    List<Instances> instances = new ArrayList<>();
        for (int i = 0; i < 100 ; i++){
            Instances instances1 = new Instances();
             instances.add(instances1);
        }

        for (int j = 0; j < 100; j ++) {
            int length = instances.size();
            int leastCount = 0;
            int[] sameActive = new int[length];  //存储相同最小活跃实例的下标
            if (instances.size() > 0) {
                int index = 0;

                for (int i = 0; i < length; i++) {
                    if (instances.get(i).activeCount.intValue() < instances.get(index).activeCount.intValue()) {
                        leastCount = 1;
                        sameActive[0] = i;
                        index = i;
                    } else if (instances.get(i).activeCount.intValue() == instances.get(index).activeCount.intValue()) {
                        sameActive[leastCount++] = i;
                    }

                }

                final Random random = new Random();
                int a = sameActive[random.nextInt(leastCount)];
                instances.get(a).activeCount.incrementAndGet();
                System.out.println(instances);
            }
        }
*/


/*
    for (int i = 0;i<20;i++ ){
        System.out.println(ThreadLocalRandom.current().nextInt(15));
    }
*/

/*       List<Instances> instances = new ArrayList<>();
        for (int i = 0; i < 20 ; i++){
            Instances instances1 = new Instances();
             instances.add(instances1);
        }
        int counts = 5;
        while(counts--!=0) {


            Instances result = null;
            int length = instances.size();
            int startIndex = ThreadLocalRandom.current().nextInt(length);
            int indexCount = 0;
            int count = 10;

            while (indexCount < count && indexCount < length) {
                Instances temp = instances.get((startIndex + indexCount) % length);
                indexCount++;
                if (result == null) {
                    temp.activeCount.incrementAndGet();
                    result = temp;
                } else {
                    if (temp.activeCount.intValue() < result.activeCount.intValue()) {
                        temp.activeCount.incrementAndGet();
                        result = temp;
                    }
                }
                System.out.println(instances);

            }
            System.out.println();
        }*/

    int[] weights = {10,10,10};

    int n =100;
    int n1 = 0;
    int n2 = 0;
    int n3 =0;
        while(n-- != 0) {
            int i = roundRobin(weights);
            if (i == 0)n1++;
            if (i == 1)n2++;
            if (i == 2)n3++;
            System.out.println(weights[i]);
        }
        System.out.println("n1: "+n1+" n2: "+n2+" n3: "+n3);

    }


    public static int roundRobin(int[] weights) {
 /*       int clientSize = weights.length;
        int gcdWeights = gcdWeight(weights,weights.length);
        int maxWeight = maxWeight(weights);

        if (lastSelected >= clientSize) {
            lastSelected = clientSize - 1;
        }
        while (true) {
            lastSelected = (lastSelected + 1) % clientSize;
            if (lastSelected == 0) {
                currentWeight = currentWeight - gcdWeights;
                if (currentWeight <= 0) {
                    currentWeight = maxWeight;
                    if (currentWeight == 0) {
                        return -1;
                    }
                }
            }
            if (weights[lastSelected] >= currentWeight) {
                return lastSelected;
            }
        }*/

            int length = weights.length;
            int maxWeight = maxWeight(weights);
            int minWeight = minWeight(weights);

            //实例权重相同
            if (minWeight == maxWeight){
                return  (++currentIndex) % length;
            }
            //计算权重最大公约数
            int gcdWeight = gcdWeight(weights,weights.length);

            if(currentIndex >= length){
                currentIndex = length -1;
            }
            while (true){
                currentIndex = (currentIndex+1) % length;
                if (currentIndex == 0){
                    currentWeight = currentWeight - gcdWeight;
                    if (currentWeight <= 0){
                        currentWeight = maxWeight;
                    }
                }
                if (weights[currentIndex] >= currentWeight){
                    return  currentIndex;
                }
            }
    }
    public static int gcdWeight(int[] weights, int lenght){

        if (lenght == 1){
            return weights[0];
        }else {
            return gcd(weights[lenght - 1], gcdWeight(weights, lenght - 1));
        }
    }


    public static int gcd(int a,int b){

        if (b == 0){
            return a;
        }else {
            return gcd(b,a%b);
        }
    }
    private static int maxWeight(int[] weights) {
        int max = weights[0];
        for (int it : weights) {
            if (it > max) {
                max = it;
            }
        }
        return max;
    }
    private static int minWeight(int[] weights) {
        int min = weights[0];
        for (int it : weights) {
            if (it < min) {
                min = it;
            }
        }
        return min;
    }


}
