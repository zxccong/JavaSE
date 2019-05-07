package day11;

import day07.Demo_Student;

/**
 * Object 的equal方法
 */
public class Demo4_equals {
    public static void main(String[] args) {
        Demo_Student s = new Demo_Student("张三",25);
        Demo_Student s2 = new Demo_Student("李四",25);

        /*
        public boolean equals(Object obj) {
        return (this == obj);
        }
        Object中的equals方法是比较对象的地址值，没有什么意义，我们需要重写他
        因为开发中我们通常比较的是对象的属性值，我们认为相同的属性是相同的对象，
        我们需要重写equals方法 Demo_Student
         */
        s.equals(s2);

    }
}
