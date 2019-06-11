package day26;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDP
 * 接收
 * 2.接收Receive
 *  *   	* 创建DatagramSocket, 指定端口号
 *  *   	* 创建DatagramPacket, 指定数组, 长度
 *  *   	* 使用DatagramSocket接收DatagramPacket
 *  *   	* 关闭DatagramSocket
 *  *   	* 从DatagramPacket中获取数据
 */
public class Demo1_UDP_Receive {
    public static void main(String[] args) throws Exception {

        //创建socket
        DatagramSocket socket = new DatagramSocket(6666);
        //创建packet
        DatagramPacket packet = new DatagramPacket(new byte[1024],1024);

        socket.receive(packet);
        byte[] arr= packet.getData();
        int len = packet.getLength();
        new String(arr,0,len);
        socket.close();
    }
}
