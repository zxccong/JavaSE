package day09;

/**
 * 抽象类学习 抽象类成员的特点
 */
public class Demo2_Abstract {
    public static void main(String[] args) {

    }
}
abstract class Demo{
    int num =10;
    final int num2 =20;
    public Demo(){

    }

    public abstract  void method();//统一规则

}

class Test extends Demo{

    @Override
    public void method() {
        System.out.println("111");
    }
}
