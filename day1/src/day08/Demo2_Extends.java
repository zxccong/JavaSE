package day08;

/**
 * 继承中构造方法的关系
 */
public class Demo2_Extends {
    public static void main(String[] args) {
        Son1 son = new Son1();
    }
}
 class Father1 {
    public Father1(){
        super();//object的类
        System.out.println("父类的构造方法");
    }
}

 class  Son1 extends Father1 {
    public Son1(){
        super();//如果不写，系统会默认加上
        System.out.println("子类的构造方法");
    }
}

