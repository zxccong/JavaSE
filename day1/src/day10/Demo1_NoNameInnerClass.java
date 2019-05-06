package day10;

/**
 * 匿名内部类
 */
public class Demo1_NoNameInnerClass {
    public static void main(String[] args) {
        /*Outer o = new Outer();
        o.method();*/
    }
}

/*interface  Inter{
    public void print();
    void  print2();
}*/

/*class Outer{
    class Inner implements Inter{

        @Override
        public void print() {
            System.out.println("123");
        }

        @Override
        public void print2() {

        }
    }

    public void method(){       //整个就是子类对象可以直接调用.print()
//        Inter i  = new Inner();
//        i.print();
        new Inner().print();    //整个就是子类对象可以直接调用.print()
        new Inner(){        //实现Inter接口

            @Override
            public void print() {   //重写抽象方法
                System.out.println("123");
            }
            //重写多个方法
            @Override
            public void print2() {
                System.out.println("456");
            }

            public void print3(){
                System.out.println("特有的方法");
            }
        }.print();
    }
}*/
