package day17;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * LinkedHashSet的学习
 * 底层是链表实现的，是set中唯一一个能保证怎么存就怎么取的集合对象
 * 因为HashSet的子类，所以也是保证元素的唯一性，与和HashSet原理一样
 */
public class Demo2_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> linkHashSet = new LinkedHashSet<String>();
        linkHashSet.add("a");
        linkHashSet.add("a");
        linkHashSet.add("a");
        linkHashSet.add("a");
        linkHashSet.add("a");
        System.out.println(linkHashSet);

    }
}
