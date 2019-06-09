package day24;

/**
 * 多线程实现方法二
 */
public class Demo3_Thread {
    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
        //主线程进行抢夺资源
        for (int i = 0; i < 700; i++) {
            System.out.println("主线程");
        }
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("我的线程");
    }
}
