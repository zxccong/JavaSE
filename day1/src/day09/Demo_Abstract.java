package day09;

/**
 * 抽象类学习
 */
public class Demo_Abstract {

    public static void main(String[] args) {

        Animal a = new Cat();
    }
}

abstract class Animal{
    public abstract void eat();
}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
