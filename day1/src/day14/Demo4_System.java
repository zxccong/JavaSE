package day14;

/**
 * System类的学习
 */
public class Demo4_System {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Demo();
            System.gc();        //运行垃圾回收器，相当于呼喊保洁阿姨
        }
        System.exit(0);
        System.out.println("123");


    }
}
class Demo{             //在一个源文件中不允许定义两个用public 修饰的类
    @Override
    protected void finalize() throws Throwable {
        System.out.println("垃圾被清扫了");
    }
}
