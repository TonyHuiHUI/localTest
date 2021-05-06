package nio;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * @author hui
 * 2020/8/27 0027 17:37
 *
 * 未使用 Netty 的阻塞网络编程
 */
public class PlainOioServer {
    public void server(int port) throws IOException {
        //将服务器绑定到指定端口上
        final ServerSocket socket = new ServerSocket(port);
        for(;;){
            //接收连接
            final Socket clientSocket = socket.accept();
            System.out.println("Accepted connection from " + clientSocket);
            //创建新线程来处理连接
            new Thread(() -> {
                OutputStream out;
                try {
                    out = clientSocket.getOutputStream();
                    //将消息写给已连接的客户端
                    out.write("Hi!\r\n".getBytes(Charset.forName("UTF-8")));
                    out.flush();
                    //关闭连接
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                finally {
                    try {
                        clientSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
