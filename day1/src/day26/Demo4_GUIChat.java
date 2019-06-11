package day26;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * GUI聊天
 */
public class Demo4_GUIChat extends Frame {

    private Button send;
    private Button log;
    private Button clear;
    private Button shake;
    private TextArea viewArea;
    private TextArea sendArea;
    private TextField tf;
    private DatagramSocket socket;
    private BufferedWriter bufferedWriter;


    //构造方法
    public Demo4_GUIChat(){
        init();
        southPanel();
        centerPanel();
        event();
    }

    private void event() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    socket.close();
                    bufferedWriter.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                System.exit(0);
            }
        });

        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    send();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    logFile();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewArea.setText("");
            }
        });
        shake.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String message = sendArea.getText();
                    send(message,new byte[]{-1});
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        sendArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

//                if (e.getKeyCode()==KeyEvent.VK_SPACE&& e.isControlDown()){   //ctrl+加什么键
                if (e.getKeyCode()==KeyEvent.VK_SPACE){
                    try {
                        send();
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
    }
    private void shake() throws InterruptedException {
        int x= this.getLocation().x;
        int y= this.getLocation().y;
        for (int i = 0; i < 10; i++) {
            this.setLocation(x+20,y+20);
            Thread.sleep(20);
            this.setLocation(x+20,y-20);
            Thread.sleep(20);
            this.setLocation(x-20,y+20);
            Thread.sleep(20);
            this.setLocation(x-20,y-20);
            Thread.sleep(20);
            this.setLocation(x,y);
        }


    }

    private void logFile() throws IOException {
        bufferedWriter.flush();
        FileInputStream fileInputStream = new FileInputStream("config.txt");
        ByteOutputStream byteOutputStream = new ByteOutputStream();
        int len ;
        byte[] arr = new byte[8192];
        while ((len=fileInputStream.read(arr))!=-1){
            byteOutputStream.write(arr,0,len);
        }
        String str = byteOutputStream.toString();
        viewArea.setText(str);
    }

    private void send() throws Exception {
        String message = sendArea.getText();
        String ip = tf.getText();
        ip=ip.trim().length()==0?"255.255.255.255":ip;
        //创建packet
         byte[] bytes = message.getBytes();
        send(ip, bytes);
        //设置日期
        String time = getCurrentTime();
        String str = time+" 我对： "+(ip.equals("255.255.255.255")?"所有人":ip)+"说\r\n"+message+"\r\n\r\n";
        viewArea.append(str);      //添加到显示区域
        bufferedWriter.write(str);
        sendArea.setText(null);


    }

    private void send(String ip, byte[] arr) throws IOException {
        DatagramPacket packet = new DatagramPacket(arr, arr.length, InetAddress.getByName(ip),6666);
        socket.send(packet);
    }

    private String getCurrentTime() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        return sdf.format(d);
    }

    private void centerPanel() {
        Panel center = new Panel();
        viewArea = new TextArea(5,1);
        //设置不可编辑
        viewArea.setEditable(false);
        //设置背景颜色
        viewArea.setBackground(Color.WHITE);
        //设置字体样式
        viewArea.setFont(new Font("xxx",Font.PLAIN,15));
        sendArea = new TextArea();
        sendArea.setFont(new Font("xxx",Font.PLAIN,15));
        center.setLayout(new BorderLayout());
        center.add(sendArea,BorderLayout.SOUTH);
        center.add(viewArea,BorderLayout.CENTER);
        this.add(center,BorderLayout.CENTER);
    }

    private void southPanel() {
        Panel south = new Panel();
        tf = new TextField(15);
        tf.setText("127.0.0.1");
        send = new Button("发送");
        log = new Button("记录");
        clear = new Button("清屏");
        shake = new Button("震动");
        south.add(tf);
        south.add(send);
        south.add(log);
        south.add(clear);
        south.add(shake);
        this.add(south,BorderLayout.SOUTH);
    }

    private void init() {
        //设置位置
        this.setLocation(500,50);
        //设置窗口大小
        this.setSize(400,600);
        //创建socket
        try {
            socket = new DatagramSocket();
            bufferedWriter = new BufferedWriter(new FileWriter("config.txt",true));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //开启页面监听
        new Receive().start();
        //设置可见
        this.setVisible(true);
        this.setTitle("GUI聊天");
    }

    //新起一个线程接收消息
    private class Receive extends Thread{
        @Override
        public void run() {

            try {

                //创建socket
                DatagramSocket socket = new DatagramSocket(6666);
                //创建packet
                DatagramPacket packet = new DatagramPacket(new byte[8192],8192);
                //获取信息
                while (true) {
                    socket.receive(packet);

                    byte[] arr = packet.getData();
                    int len = packet.getLength();
                    if(arr[0]==-1&&len==1){
                        shake();
                        continue;
                    }
                    String s = new String(arr, 0, len);
                    String time = getCurrentTime();
                    String ip = packet.getAddress().getHostAddress();    //获得ip地址
                    String str=time + " " + ip + " 对我说：\r\n" + s + " \r\n\r\n";
                    bufferedWriter.write(str);
                    viewArea.append(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        new Demo4_GUIChat();
    }
}
