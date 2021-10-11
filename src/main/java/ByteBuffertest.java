import sun.nio.ch.DirectBuffer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.CountDownLatch;

/**
 * @author hui
 * 2021/10/8 0008 17:36
 */
public class ByteBuffertest {
    public static void main(String[] args) throws Exception {
//        int bufferSize = 50 * 1024 * 1024;
//        File file = new File("");
//        FileChannel fileChannel = new RandomAccessFile(file, "rw").getChannel();
//        ByteBuffer byteBuffer = ByteBuffer.allocate(bufferSize);//申请50M的堆内内存直接进行写入，在底层每个线程会额外申请相同大小的堆外内存，会导致堆外内存的暴增
//        fileChannel.read(byteBuffer);


//        File file = new File("C:\\Users\\Administrator\\Desktop\\upay.txt");
//        FileChannel fileChannel = new RandomAccessFile(file, "rw").getChannel();
//        ByteBuffer byteBuffer = ByteBuffer.allocate(4* 1024 * 1024);
//        ByteBuffer directByteBuffer = ByteBuffer.allocateDirect( 4 * 1024); //申请4k的堆外内存进行copy，自己控制申请堆外内存的大小
//        for (int i = 0; i < 1000; i++){
//            Thread.sleep(1000);
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        for (int i = 0; i < 1024; i++){
//                            directByteBuffer.clear();
//                            fileChannel.read(directByteBuffer, i * 4 * 1024);
//                            directByteBuffer.flip();
//                            byteBuffer.put(directByteBuffer);
//                        }
////                        fileChannel.read(byteBuffer);
//                        byteBuffer.clear();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }).start();
//        }


//        WriteByDirectByteBufferTest1();
//        WriteByDirectByteBufferTest1();
//        WriteByDirectByteBufferTest3();
        WriteByMappedByteBufferTest();

    }

    public void directBufferCopy() throws Exception {
        File file = new File("/essd");
        FileChannel fileChannel = new RandomAccessFile(file, "rw").getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(50 * 1024 * 1024);
        ByteBuffer directByteBuffer = ByteBuffer.allocateDirect(4 * 1024);//申请4k的堆外内存进行copy
        for (int i = 0; i < 12800; i++) {
            directByteBuffer.clear();
            fileChannel.read(directByteBuffer, i * 4 * 1024);
            directByteBuffer.flip();
            byteBuffer.put(directByteBuffer);
        }
    }

    //将变量设置为null, 内存依然无法释放
    public static void WriteByDirectByteBufferTest1() throws IOException, InterruptedException {
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024 * 1024 * 1024);
        System.in.read();
        buffer = null;
        new CountDownLatch(1).await();
    }

    //将变量设置为null，手动触发GC，回收堆外空闲内存
    public static void WriteByDirectByteBufferTest2() throws IOException, InterruptedException {
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024 * 1024 * 1024);
        System.in.read();
        buffer = null;
        System.gc();
        new CountDownLatch(1).await();
    }

    //手动回收堆外内存
    public static void WriteByDirectByteBufferTest3() throws IOException, InterruptedException {
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024 * 1024 * 1024);
        System.in.read();
        ((DirectBuffer) buffer).cleaner().clean();
        new CountDownLatch(1).await();
    }

    //Mmap 内存映射的大小不等于内存占用的大小，此处映射了1000G的内存，显然我的电脑没有这么大的内存
    //MappedByteBuffer 映射出一片文件内容之后，不会全部加载到内存中，而是会进行一部分的预读
    public static void WriteByMappedByteBufferTest() throws IOException, InterruptedException {
        File data = new File("C:\\Users\\Administrator\\Desktop\\upay.txt");
        FileChannel fileChannel = new RandomAccessFile(data, "rw").getChannel();
        for (int i = 0; i < 1000; i++) {
            fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 1024L * 1024 * 1024);
        }
        System.out.println("map finish");
        new CountDownLatch(1).await();
    }
}
