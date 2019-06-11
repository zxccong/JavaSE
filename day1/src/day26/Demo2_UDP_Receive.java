package day26;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UDP接收端优化
 */
public class Demo2_UDP_Receive {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6666);						//创建socket相当于创建码头
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);		//创建packet相当于创建集装箱

        while(true) {
            socket.receive(packet);												//接收货物
            byte[] arr = packet.getData();
            int len = packet.getLength();
            String ip = packet.getAddress().getHostAddress();           //获取ip地址
            int port = packet.getPort();                                //获取端口号
            System.out.println(ip + ":" + new String(arr,0,len));
        }
    }
}
