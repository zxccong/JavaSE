package day08;

/**
 * entend学习
 */
public class Demo1_Extend {
    public static void main(String[] args) {

    }
}
class Animal{
    String color;
    int leg;
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("吃饭cat");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("吃饭dog");
    }
}

/*
extends 是继承的意思
Animal 是父类
Cat和Dog都是子类
 */

