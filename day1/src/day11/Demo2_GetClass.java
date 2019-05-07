package day11;


import day07.Demo_Student;

/**
 * Object类的getClass
 */
public class Demo2_GetClass {
    public static void main(String[] args) {
        Demo_Student s = new Demo_Student("张三",23);
        Class clazz = s.getClass();
        String name = clazz.getName();
        System.out.println(name);


    }
}
