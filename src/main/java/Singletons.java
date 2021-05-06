import java.util.HashMap;

/**
 * @author hui
 * 2021/4/12 0012 13:39
 */
public class Singletons {
    public static void main(String[] args) {
        int newCapacity = 4 + (4 >> 1);
        System.out.println("..." + newCapacity);
    }
}

class LazySingleton{
    private static volatile LazySingleton instance = null;
    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}

class HungrySingleton{
    private static  volatile  HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}
    public HungrySingleton getInstance(){
        return instance;
    }
}
class DoubleCheckSingleton{
    private static  volatile  DoubleCheckSingleton instance = null;
    private  DoubleCheckSingleton(){}
    public DoubleCheckSingleton getInstance(){
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}

class InnerClassSingleton{
    private static class SingletonHolder{
        private static final  InnerClassSingleton instance = new InnerClassSingleton();
    }
    private InnerClassSingleton(){}
    public static InnerClassSingleton getInstance(){
        return SingletonHolder.instance;
    }
}

enum  Singleton{
    INSTANCE;
    public void  whateverMethod(){

    }
}
