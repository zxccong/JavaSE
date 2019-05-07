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

    @Override
    public String toString() {
        return "Demo_Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //不能直接写Student，因为那样就不是重写了
    @Override
    public boolean equals(Object obj) {
        /*
            object that represents the same sequence of characters as this
            Stirng 的equals 方法是比较相同的字符序列
         */
        Demo_Student student = (Demo_Student) obj;
        return this.name.equals(student.name)&&this.age== student.age;
    }


}
