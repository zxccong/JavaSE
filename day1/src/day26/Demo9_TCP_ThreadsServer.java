package day26;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP的服务端
 *
 **
 *
 * * 2.服务端(多线程)
 * 	*
 *
 */
public class Demo9_TCP_ThreadsServer {
    public static void main(String[] args) throws Exception {
        //
        ServerSocket server = new ServerSocket(12345);
        //接收请求
        while(true) {
            final Socket socket = server.accept();				//接受客户端的请求
            new Thread() {
                public void run() {
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        PrintStream ps = new PrintStream(socket.getOutputStream());
                        ps.println("欢迎咨询传智播客");
                        System.out.println(br.readLine());
                        ps.println("报满了,请报下一期吧");
                        System.out.println(br.readLine());
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }

    }
}
