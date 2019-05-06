package day10;

/**
 * 匿名内部类，开发中的应用
 */
public class Test1_NoNameInnerClass {
    public static void main(String[] args) {
        //要求：如何调用PersonDemo中的method方法
        PersonDemo personDemo= new PersonDemo();
        personDemo.method(new Person() {        //方法二创建一个匿名的内部类作为参数
                                                //当作参数传递，把匿名内部类作为一个参数
            @Override
            public void show() {

            }
        });

    }
}

abstract class Person{
    public abstract void show();
}
class PersonDemo{
    public void method(Person p){
        p.show();   //由于这里的p 是抽象的没有实现
    }
}

//方法一创建一个继承Peason的类(简单略)使用多态进入
