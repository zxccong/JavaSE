package day16;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList学习
 */
public class Demo1_ArrayList {
    public static void main(String[] args) {
        //去重
        ArrayList old = new ArrayList();
        old.add("a");
        old.add("a");
        old.add("a");
        old.add("b");
        old.add("b");
        old.add("b");
        old.add("c");
        old.add("c");
        old.add("c");
        old.add("c");

        ArrayList newList = new ArrayList();
        Iterator iterator = old.iterator();
        if (iterator.hasNext()) {
            Object next = iterator.next();
            if (!newList.contains(next)) {
                newList.add(next);
            }
        }

        /*
          	public int indexOf(Object o) {
            if (o == null) {
                for (int i = 0; i < size; i++)
                    if (elementData[i]==null)
                        return i;
            } else {
                for (int i = 0; i < size; i++)
                    if (o.equals(elementData[i]))
                        return i;
            }
            return -1;
        }
         */
    }
}
