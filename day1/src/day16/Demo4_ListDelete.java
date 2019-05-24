package day16;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 列表删除，遍历中删除
 */
public class Demo4_ListDelete {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        //普通for循环删除
        /*for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("b")) {
//                list.remove(i);//b漏删了
                list.remove(i--);
            }
        }*/

        //迭代器删除
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()){
            if ("b".equals(iterator.next())){
//                list.remove("b");//并发修改异常  //不能用集合的删除方法
                iterator.remove();
            }
        }
        //迭代器第二种写法
        for (Iterator<Object> it2=list.iterator(); it2.hasNext(); ) {
            if ("b".equals(it2.next())){
                it2.remove();
            }
        }

        //forEash循环
        for (Object ob :
                list) {
            list.remove("b");
        }
        //增强for不能删除，只能遍历
        System.out.println(list);

    }
}
