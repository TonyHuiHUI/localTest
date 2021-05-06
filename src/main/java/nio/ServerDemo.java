package nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketOptions;
import java.net.StandardSocketOptions;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

/**
 * 使用了NIO的服务端应用
 */
public class ServerDemo {
    private static final int BUF_SIZE = 1024;
    private static final int PORT = 8070;
    private static final int TIMEOUT = 3000;

    public static void main(String[] args) throws IOException, InterruptedException {
        selector();
    }

    /**
     * 初始化selector以及ServerSocketChannel
     * @throws IOException
     * @throws InterruptedException
     */
    private static void selector() throws IOException, InterruptedException {
        ServerSocketChannel ssc = ServerSocketChannel.open();
        Selector selector = Selector.open();

        ssc.socket().bind(new InetSocketAddress(PORT));
        ssc.configureBlocking(false);

        ssc.register(selector, SelectionKey.OP_ACCEPT);

        // 开始轮询直至天荒地老
        while (true) {
            if (selector.select(TIMEOUT) == 0) {
                System.out.println("No io events found");
                continue;
            }

            Iterator<SelectionKey> iter = selector.selectedKeys().iterator();
            while (iter.hasNext()) {
                SelectionKey key = iter.next();

                if (key.isAcceptable()) {
                    handleAccept(key);
                }
                if (key.isWritable() && key.isValid()) {
                    handleWrite(key);
                }
                if (key.isReadable()) {
                    handleRead(key);
                }
                iter.remove();
            }
        }

    }

    private static void handleAccept(SelectionKey key) throws IOException {
        System.out.println("Handle accept event");
        ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
        SocketChannel sc = ssc.accept();
        sc.configureBlocking(false);
        //设置输入缓冲区的大小, 参看1.4小节问题3/4
        sc.setOption(StandardSocketOptions.SO_RCVBUF, 10);
        sc.register(key.selector(), SelectionKey.OP_READ);
    }

    /**
     * @param key
     * @throws IOException
     * @throws InterruptedException
     */
    private static void handleWrite(SelectionKey key) throws IOException, InterruptedException {
        System.out.println("Handle write event");
        SocketChannel sc = (SocketChannel) key.channel();
        ByteBuffer buffer = (ByteBuffer)key.attachment();
        if (buffer == null) {
            ByteBuffer.allocate(BUF_SIZE);
            buffer.put("return from server".getBytes());
            buffer.flip();
            key.attach(buffer);
        }

        int writes = sc.write(buffer);
        System.out.println("write bytes:" + writes);
        System.out.println("remain:" + buffer.remaining());
        if (buffer.remaining() == 0) {
            key.attach(null);
            key.interestOps(SelectionKey.OP_READ);
        }
    }

    private static void handleRead(SelectionKey key) throws IOException {
        System.out.println("Handle read event");
        SocketChannel sc = (SocketChannel) key.channel();
        ByteBuffer buffer = ByteBuffer.allocate(BUF_SIZE);
        long bytesRead = sc.read(buffer);
        System.out.println("read:" + bytesRead);
        if (bytesRead == -1) {
            System.out.println("Peer closed");
            sc.close();
            System.exit(0);
        }
        // 输出内容
        if (bytesRead > 0) {
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
        }

        // won't have any effect this time, and will take effect after next select() invoked
        key.interestOps(SelectionKey.OP_WRITE|SelectionKey.OP_READ);
    }
}