package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 迭代器
 */
public class Demo2_Iterator {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");

        Iterator it = c.iterator();						//获取迭代器的引用
        while(it.hasNext()) {							//集合中的迭代方法(遍历)
            System.out.println(it.next());
        }
    }
}
