package day10;

/**
 * 内部类学习
 */
public class Demo1_InnerClass {

    public static void main(String[] args) {
        /*//外部类.内部类名 =  外部类对象。内部类对象
        Outer.Inner i = new Outer().new Inner(); //创建内部类对象
        i.method();*/

        /*//内部类私有后的调用方式
        Outer outer= new Outer();
        outer.print();*/

//        Outer.Inner oi =  Outer.new Inner();
        //静态内部类的调用方式
        /*Outer.Inner oi  = new Outer.Inner();
        oi.method();*/

    }


}
//普通内部类
/*class Outer{
    private int num= 10;
    class Inner{
        public void method(){
            System.out.println("Hello World"+num);//内部类可以直接访问外部类的成员包括私有
        }
    }
}*/

//私有内部类
/*class Outer{
    private int num= 10;
    private class Inner{
        public void method(){
            System.out.println("Hello World"+num);//内部类可以直接访问外部类的成员包括私有
        }
    }

    public void print(){
        Inner i  = new Inner();
        i.method();
    }
}*/
/*
class Outer{
    static int num= 10;
    static class Inner{
        public void method(){
            System.out.println("Hello World"+num);//内部类可以直接访问外部类的成员包括私有
        }
    }
    static  class Inner2{
        public static void print(){
            System.out.println("print");
        }
    }
}*/
