package day06;

/**
 *成员变量和局部变量的学习
 */
public class Demo2_Person {

    public static void main(String[] args) {


    }
}
/*
8.成员变量和局部变量
    位置不同
        成员变量在方法外
        局部变量在方法声明中
    在内存的位置不同
        成员变量:在堆内存中（属于对象，对象进堆内存）
        局部变量：在栈内存中（属于方法，方法进栈内存）
    声明周期不一样
        成员变量，随着对象的创建而存在，随着对象的消失而消失
        局部变量随着调用而存在，随着方法调用完毕而消失
    初始化值不一样
        成员变量：有默认初始化值
        局部变量：没有默认初始化值，必须定义，赋值，才能使用
    注意事项：
        局部变量名称可以和成员变量一样，在方法中使用，采用的是就近原则
        基本数据类型变量包括byte,short,int,long,float,double,boolean,char
        引用数据类型包括：数组、类、接口、枚举
 */
class Peason{
    String name;//成员变量
    public void speak(int i ){
        int num = 10 ; //i 和 num 都是局部变量
        System.out.println("name = " + name);//有默认值
        System.out.println("num = " + num);//没有初始化值
    }
}
