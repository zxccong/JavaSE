package day10;

/**
 * 局部内部类
 */
public class Demo2_InnerClass {
    public static void main(String[] args) {

    }
}

/*//局部内部类
class Outer{
    public void method(){
        final int num = 10 ; //必须加上final修饰，内部类调用
        class Inner{
            public void print(){
                System.out.println("Hello"+num);
            }

        }
        Inner i = new Inner();
        i.print();
    }*/


    /*
        //堆栈流程分析
//    Outer.class进入方法区
    //method（）方法 进栈 int num =10;
    Inner.class进入方法区
    Inner i 进入method (栈空间)指向内存空间
    i.print();
    print () 方法进入栈
    完成后 print method 2个方法分别弹栈，导致了内存（堆）中的new Inner()
    不能够获取到int num = 10 ;的值
    如果加上final ,int num 就会进入常量池（方法区中）
    延长声明周期

     */

    /*public  void run(){
        Inner i = new Inner();      //局部内部类，只能在其所在方法中访问
        i.print();
    }*/
//}
