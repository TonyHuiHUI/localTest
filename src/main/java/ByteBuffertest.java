import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author hui
 * 2021/10/8 0008 17:36
 */
public class ByteBuffertest {
    public static void main(String[] args) throws Exception {
//        int bufferSize = 50 * 1024 * 1024;
//        File file = new File("");
//        FileChannel fileChannel = new RandomAccessFile(file, "rw").getChannel();
//        ByteBuffer byteBuffer = ByteBuffer.allocate(bufferSize);
//        fileChannel.read(byteBuffer);
        File file = new File("C:\\Users\\Administrator\\Desktop\\upay.txt");
        FileChannel fileChannel = new RandomAccessFile(file, "rw").getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(4* 1024 * 1024);
        ByteBuffer directByteBuffer = ByteBuffer.allocateDirect( 4 * 1024);
        for (int i = 0; i < 1000; i++){
            Thread.sleep(1000);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i < 1024; i++){
                            directByteBuffer.clear();
                            fileChannel.read(directByteBuffer, i * 4 * 1024);
                            directByteBuffer.flip();
                            byteBuffer.put(directByteBuffer);
                        }
//                        fileChannel.read(byteBuffer);
                        byteBuffer.clear();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

    }
    public void directBufferCopy() throws Exception {
        File file = new File("/essd");
        FileChannel fileChannel = new RandomAccessFile(file, "rw").getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(50 * 1024 * 1024);
        ByteBuffer directByteBuffer = ByteBuffer.allocateDirect(4 * 1024);
        for (int i = 0; i < 12800; i++) {
            directByteBuffer.clear();
            fileChannel.read(directByteBuffer, i * 4 * 1024);
            directByteBuffer.flip();
            byteBuffer.put(directByteBuffer);
        }
    }
}
