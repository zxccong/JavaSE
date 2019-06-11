package day26;

import java.net.*;

/**
 * UDP协议
 * * 1.发送Send
 *   	* 创建DatagramSocket, 随机端口号
 *   	* 创建DatagramPacket, 指定数据, 长度, 地址, 端口
 *   	* 使用DatagramSocket发送DatagramPacket
 *   	* 关闭DatagramSocket
 *   * 2.接收Receive
 *   	* 创建DatagramSocket, 指定端口号
 *   	* 创建DatagramPacket, 指定数组, 长度
 *   	* 使用DatagramSocket接收DatagramPacket
 *   	* 关闭DatagramSocket
 *   	* 从DatagramPacket中获取数据
 */
public class Demo1_UDP_Send {
    public static void main(String[] args) throws Exception {
        String str = "Hello　World";
        //创建socket
        DatagramSocket socket = new DatagramSocket();
        //创建packet
        DatagramPacket packet = new DatagramPacket(str.getBytes(),str.length(),InetAddress.getByName("127.0.0.1"),6666);
        //发送
        socket.send(packet);
        //关闭
        socket.close();

    }
}
