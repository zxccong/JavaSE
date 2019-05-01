package day07;

/**
 * day7通用的学习bean
 */
public class Demo_Student {
    private String name;
    private int age;

    public Demo_Student() {
    }

    public Demo_Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
