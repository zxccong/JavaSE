package day09;

/**
 * 接口的学习类
 */
public class Demo1_Interface {
    public static void main(String[] args) {
        //
        // Inter in = new Inter() //接口不能被实例化
        Inter in = new DemoI();//父类引用子类对象
    }
}

interface Inter{
    public abstract  void print(); //类中的方法都是抽象的
}

class DemoI implements Inter{

    @Override
    public void print() {
        System.out.println("print");
    }
}
