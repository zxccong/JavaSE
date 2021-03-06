package day26;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP的服务端
 *
 **
 *
 * * 2.服务端
 * 	* 创建ServerSocket(需要指定端口号)
 * 	* 调用ServerSocket的accept()方法接收一个客户端请求，得到一个Socket
 * 	* 调用Socket的getInputStream()和getOutputStream()方法获取和客户端相连的IO流
 * 	* 输入流可以读取客户端输出流写出的数据
 * 	* 输出流可以写出数据到客户端的输入流
 *
 */
public class Demo5_TCP_Server {
    public static void main(String[] args) throws Exception {
        //
        ServerSocket server = new ServerSocket(12345);
        //接收请求
        Socket socket = server.accept();
        //获取客户端的输入流
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        os.write("你好".getBytes());

        byte[]  arr= new byte[1024];
        int len = is.read(arr);
        System.out.println(new String(arr,0,len));
        socket.close();

    }
}
