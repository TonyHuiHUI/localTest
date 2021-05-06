import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class TestB {

    private static ReferenceQueue<byte[]> referenceQueue = new ReferenceQueue<>();
    private static int _1M = 1024 * 1024;

    public static void main(String[] args) throws InterruptedException {
        final Map<Object, MyWeakReference> hashMap = new HashMap<>();
        Thread thread = new Thread(() -> {
            try {
                int n = 0;
                MyWeakReference k;
                while (null != (k = (MyWeakReference) referenceQueue.remove())) {
                    System.out.println((++n) + "回收了:" + k);
                    hashMap.remove(k.key);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.setDaemon(true);
        thread.start();

        for (int i = 0; i < 10000; i++) {
            byte[] bytesKey = new byte[_1M];
            byte[] bytesValue = new byte[_1M];
            hashMap.put(bytesKey, new MyWeakReference(bytesKey, bytesValue, referenceQueue));
        }
        System.out.println(hashMap.size());
        System.out.println();
        System.gc();
        Thread.sleep(10000);
    }

    static class MyWeakReference extends SoftReference<byte[]> {
        private Object key;

        MyWeakReference(Object key, byte[] referent, ReferenceQueue<? super byte[]> q) {
            super(referent, q);
            this.key = key;
        }
    }
}