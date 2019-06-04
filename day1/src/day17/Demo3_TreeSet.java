package day17;

import java.util.TreeSet;

/**
 * TreeSet学习
 * TreeSet集合是用来对元素进行排序
 *
 */
public class Demo3_TreeSet {
    public static void main(String[] args) {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add(100);
        ts.add(100);
        ts.add(100);
        ts.add(200);
        ts.add(200);
        ts.add(200);
        ts.add(300);
        ts.add(300);
        ts.add(300);

        //要继承Comparaable才能进行比较

    }
}
