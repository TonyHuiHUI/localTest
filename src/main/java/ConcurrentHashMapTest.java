import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * @author hui
 * 2021/4/13 0013 18:43
 */
public class ConcurrentHashMapTest {
    ConcurrentHashMap<String,Long> concurrentHashMap = new ConcurrentHashMap<>();
    ThreadPoolExecutor  threadPoolExecutor = new ThreadPoolExecutor(20,40,5,TimeUnit.SECONDS,new LinkedBlockingDeque<>(2));



}
