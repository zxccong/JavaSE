package day15;

import day07.Demo_Student;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合类学习
 */
public class Demo1_Collection {
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    public static void main(String[] args) {
        /*
        * A:案例演示
  *
  		基本功能演示

  		boolean add(E e)
  		boolean remove(Object o)
  		void clear()
  		boolean contains(Object o)
  		boolean isEmpty()
  		int size()

  * B:注意:
  *
  		collectionXxx.java使用了未经检查或不安全的操作.
  		注意:要了解详细信息,请使用 -Xlint:unchecked重新编译.
  		java编译器认为该程序存在安全隐患
  		温馨提示:这不是编译失败,所以先不用理会,等学了泛型你就知道了
         */
        Collection strings = new ArrayList<>();
        strings.add(1.0);
        strings.add(15);        //自动装箱
        strings.add(new Demo_Student("12",4));

        /*
        public boolean add(E e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
    }
    所以ArrayList没必要搭理返回值
         */
        strings.toString();
        /*
        public String toString() {
        Iterator<E> it = iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (! it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }
         */

        /*
        Ctrl+1 ->添加SuppressWarning("rawtypes")
        //忽略没有泛型的黄色警告
        idea Alt+Enter
         */
        strings.remove(1.0);        //删除指定元素
        strings.clear();                //清空
        strings.contains(new Demo_Student()); //包含
        strings.isEmpty();           //是否为空
        strings.size();             //大小

        Collection coll = new ArrayList();
        coll.add(new Demo_Student("张三",23));		//Object obj = new Demo_Student("张三",23);
        coll.add(new Demo_Student("李四",24));
        coll.add(new Demo_Student("王五",25));
        coll.add(new Demo_Student("赵六",26));

        Object[] arr = coll.toArray();				//将集合转换成数组
        for (int i = 0; i < arr.length; i++) {
            Demo_Student s = (Demo_Student)arr[i];			//强转成Student
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}
