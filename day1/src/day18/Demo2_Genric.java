package day18;

import day06.Student;

import java.util.ArrayList;

/**
 * 泛型固定下边界
 */
public class Demo2_Genric {
    /**
     * 泛型固定下边界
     *
     * ？super E
     *
     * 泛型固定下边界
     *
     * ？extends E
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Student> objects = new ArrayList<>();

        //addAll(Collection<? extends E> c )
        //可以添加任何继承与Student的类
        //固定下边界

        //TreeSet(Comoparator<? super E> comparator)
        //设置了比较Student也会比较Student
        //固定上边界

        //？extend E

        //？super
    }
}
