package day26;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP客户端
 *
 * 1.客户端
 *  * 	* 创建Socket连接服务端(指定ip地址,端口号)通过ip地址找对应的服务器
 *  * 	* 调用Socket的getInputStream()和getOutputStream()方法获取和服务端相连的IO流
 *  * 	* 输入流可以读取服务端输出流写出的数据
 *  * 	* 输出流可以写出数据到服务端的输入流
 */
public class Demo6_TCP_Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",12345);
        //获取客户端的输入流
        InputStream is = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
    }
}
