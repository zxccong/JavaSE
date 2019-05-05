package day08;

/**
 * 代码块的学习
 */
public class Demo1_Code {
    public static void main(String[] args) {
        //局部代码块
        {int x= 10;
            System.out.println("x = " + x);
        }
        //System.out.println("x = " + x);不能访问
        //限定了变量的声明周期


    }
}

class  Student{

    //构造代码块：每构造一次对象就会执行一次，优先于构造函数执行
    private String name;
    {
        this.name="张三";
    }
    //静态代码块，不管创建几次对象只执行一次
    static {

    }
}