package day10;

/**
 * 匿名内部类的面试题
 */
public class Test2_NoNameInnerClass {
    public static void main(String[] args) {
        Outer.method().show(); //链式编程，每次调用方法后还能继续调用方法，证明调用方法的返回的是对象
    }
}

interface Inter{
    void show();
}

class Outer{
    //要求补齐代码
    public static Inter method(){
        return new Inter() {
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}

//控制台输出“HelloWorld”
