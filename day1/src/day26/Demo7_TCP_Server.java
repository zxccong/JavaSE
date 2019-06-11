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
public class Demo7_TCP_Server {
    public static void main(String[] args) throws Exception {
        //
        ServerSocket server = new ServerSocket(12345);
        //接收请求
        Socket socket = server.accept();
        //获取客户端的输入流
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        //之所以不用BufferedWrite是避免每次都写换行
        PrintStream ps = new PrintStream(os);

        ps.println("欢迎咨询传智播客");//一定要换行，readLine是以换行，为结束标记的
        System.out.println(br.readLine());
        ps.println("报满了,请报下一期吧");
        System.out.println(br.readLine());
        server.close();
        socket.close();

    }
}
