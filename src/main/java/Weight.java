public class Weight {

    static int calculateWarmupWeight(int uptime, int warmup, int weight) {
        int ww = (int) ((float) uptime / ((float) warmup / (float) weight));
        return ww < 1 ? 1 : (ww > weight ? weight : ww);
    }

    static int getWeight() {
        int weight = 100; //默认权重
        if (weight > 0) {
            long timestamp = System.currentTimeMillis() - 1000;
            if (timestamp > 0L) {
                int uptime = (int) (System.currentTimeMillis() - timestamp);
                int warmup = Constants.DEFAULT_WARMUP;
                if (uptime > 0 && uptime < warmup) {
                    weight = calculateWarmupWeight(uptime, warmup, weight);
                }
            }
        }
        return weight;
    }
    public static void main(String[] args){

     //  System.out.println(getWeight());

        System.out.println(calculateWarmupWeight(10000,60000,100));

        return ;
    }

}


