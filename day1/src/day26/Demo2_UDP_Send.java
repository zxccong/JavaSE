package day26;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * UDP发送端优化
 */
public class Demo2_UDP_Send {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();		//创建socket相当于创建码头
        Scanner sc = new Scanner(System.in);

        while(true) {
            String str = sc.nextLine();
            if("quit".equals(str))
                break;
            DatagramPacket packet = 							//创建packet相当于创建集装箱
                    new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
            socket.send(packet);			//发货
        }
        socket.close();
    }
}
