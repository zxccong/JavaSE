package day16;

import java.util.LinkedList;

/*
 * B:LinkedList类特有功能
 * public void addFirst(E e)及addLast(E e)
 * public E getFirst()及getLast()
 * public E removeFirst()及public E removeLast()
 * public E get(int index);
 */
public class Demo3_LinkedList {
    private LinkedList list = new LinkedList();		//创建LinkedList对象

    public void in(Object obj) {
        list.addLast(obj);							//封装addLast()方法
    }

    public Object out() {
        return list.removeLast();					//封装removeLast()方法
    }

    public boolean isEmpty() {
        return list.isEmpty();						//封装isEmpty()方法
    }
    public static void main(String[] args) {
        LinkedList<Object> objects = new LinkedList<>();
        objects.addFirst("1");
        objects.addLast("2");
        objects.removeFirst();
        objects.removeLast();
        objects.get(0);
        /*
        get();源码
        checkElementIndex(index);
        return node(index).item;

        Node<E> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {      //如果小于size/2
            Node<E> x = first;          //从头找
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {                    //从尾找
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }



         */


    }
}
