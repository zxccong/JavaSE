package day24;

/**
 * 证明jvm是多线程的
 */
public class Demo1_Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            new Demo();
        }

        for (int i = 0; i < 10000; i++) {
            System.out.println("我是主线程");
        }
    }
}
class Demo{
    @Override
    protected void finalize() {
        System.out.println("垃圾被清理了");
    }
}
