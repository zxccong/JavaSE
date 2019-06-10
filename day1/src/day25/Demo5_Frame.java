package day25;

import java.awt.*;
import java.awt.event.*;

/**
 * GUI
 */
public class Demo5_Frame {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(400, 600);//大小
        frame.setLocation(500, 50);
        frame.setIconImage(Toolkit.getDefaultToolkit().createImage("qq.png"));
        //设置图标
        Button button = new Button();
        frame.add(button);
        //设置布局(流式)布局管理器
        frame.setLayout(new FlowLayout());

        frame.setVisible(true); //设置窗体可见
        //事件源是窗体,把监听器注册到事件源上
        //事件对象传递给监听器
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                //退出虚拟机,关闭窗口
                System.exit(0);
            }
        });
        //添加鼠标事件
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

        });

        //键盘
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                System.exit(0);
                //VK_SPACK空格键
                if(e.getKeyCode()==KeyEvent.VK_SPACE){
                    System.exit(0);
                }
            }
        });

        //动作
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
