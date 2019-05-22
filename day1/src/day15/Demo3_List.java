package day15;

import java.util.ArrayList;
import java.util.List;

/**
 * List学习
 */
public class Demo3_List {
    /*
    A:List集合的特有功能概述
  	* void add(int index,E element)
  	* E remove(int index)
  	* E get(int index)
  	* E set(int index,E element)
     */
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(4,"f");    //index <=size 并且index>=0都不会报异常
        list.add(10,"z");//报错 数组越界异常

        Object remove = list.remove(1); //将被删除的元素 返回
        list.add(1111);
        list.remove(1111);  //删除的时候不会自动装箱,把1111当做索引


        list.get(0);

        //通过索引遍历集合
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

    }
}
