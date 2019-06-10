package day25;

/**
 * 单例设计模式
 *
 * 饿汉式和懒汉式的区别
 * 1.饿汉式是空间换时间，懒汉式是时间换空间
 * 2.在多线程访问的时候，饿汉不会创建多个对象，而懒汉可能创建多个对象
 */
public class Demo1_Sinleton {
    public static void main(String[] args) {
        //如果不私有就会导致地址值不一样
        /*Singleton s1 = Singleton.s;
        Singleton.s = null;
        Singleton s1 = Singleton.s;*/

    }
}

//饿汉
class Singleton{

    //1,私有构造函数，其他类不能访问该构造方法了
    private Singleton(){}

    //2,创建本类对象
    private static Singleton s = new Singleton();

    //3,对外提供公共的访问方法
    public static Singleton getInstance() {
        return s;
    }

    public static void print() {
        System.out.println("11111111111");
    }

}

//懒汉式,单例的延迟加载模式
class Singleton2 {
    //1,私有构造函数
    private Singleton2(){}
    //2,声明一个本类的引用
    private static Singleton2 s;
    //3,对外提供公共的访问方法
    public static Singleton2 getInstance() {
        if(s == null)
            //线程1,线程2
            s = new Singleton2();//多线程访问有可能 创建多个对象
        return s;
    }

    public static void print() {
        System.out.println("11111111111");
    }
}

class Singleton3 {
    private Singleton3() {}

    public static final Singleton3 s = new Singleton3();//final是最终的意思,被final修饰的变量不可以被更改
}
