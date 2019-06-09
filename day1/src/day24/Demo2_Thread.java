package day24;

/**
 * 多线程
 */
public class Demo2_Thread {
    public static void main(String[] args) {
        myThread myThread = new myThread();
        myThread.start();

        //主线程进行抢夺资源
        for (int i = 0; i < 700; i++) {
            System.out.println("主线程");
        }
        /*
        主线程
我的线程
主线程
         */
    }
}
class myThread extends Thread{
    @Override
    public void run() {
        //执行方法
        System.out.println("我的线程");
    }
}
