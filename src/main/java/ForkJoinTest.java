import java.util.concurrent.RecursiveTask;

/**
 * @author hui
 * 2021/3/29 0029 17:34
 */
public class ForkJoinTest  extends RecursiveTask<Long> {
    private Long start;
    private Long end;
    private static final Long THRESHOLD = 10000L;

    public ForkJoinTest(Long start, Long end){
        this.start = start;
        this.end = end;
    }
    @Override
    protected Long compute() {
        Long length = this.end - this.start;
        if(length > THRESHOLD){
            long mid = (start + end)/2;
            ForkJoinTest left = new ForkJoinTest(start,mid);
            left.fork();
            ForkJoinTest right = new ForkJoinTest(mid + 1, end);
            right.fork();
            return left.join() + right.join();
        }else {
            long sum = 0;
            for(long i = start; i <= end;i++){
                sum += i;
            }
            return sum;
        }
    }
}

