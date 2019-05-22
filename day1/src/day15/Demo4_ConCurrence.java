package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 并发修改导致异常
 */
public class Demo4_ConCurrence {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("world");
        list.add("d");
        list.add("e");

   			/*Iterator it = list.iterator();
   			while(it.hasNext()) {
   				String str = (String)it.next();
   				if(str.equals("world")) {
   				                                //遍历的同时修改叫做并发修改
   					list.add("javaee");			//这里会抛出ConcurrentModificationException并发修改异常
   				}
   			}*/
        ListIterator lit = list.listIterator();		//如果想在遍历的过程中添加元素,可以用ListIterator中的add方法
        while(lit.hasNext()) {
            String str = (String)lit.next();
            if(str.equals("world")) {
                lit.add("javaee");
                //list.add("javaee");
            }
        }
   			/*
   			集合框架(ListIterator)(了解)
               * boolean hasNext()是否有下一个
               * boolean hasPrevious()是否有前一个
               * Object next()返回下一个元素
               * Object previous();返回上一个元素
   			 */
   			while (lit.hasNext()){
                System.out.println(lit.previous());
            }
            //如果不遍历前一个，后面一个也不会遍历
            //初始指针指向0
        //要先正着遍历才能反着遍历

            while (lit.hasPrevious()){
                System.out.println(lit.previous());
            }
    }
}
