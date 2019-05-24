package day17;

import day07.Demo_Student;

import java.util.HashSet;
import java.util.Objects;

/**
 * HashSet
 */
public class Demo1_HashSet {

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo1_HashSet that = (Demo1_HashSet) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        boolean a = hs.add("a");
        boolean b = hs.add("a");        //存储重复元素的时候返回false
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
        System.out.println(hs);     //底层重写了toString 的方法

        /*
        Set 集合，无索引（下标），不可重复，无需（存取不一致）
         */

        for (String string:hs
             ) {
            System.out.println(string);     //只要能用迭代器迭代的，就可以用增强for循环遍历


            HashSet<Demo_Student> demo_students = new HashSet<Demo_Student>();
            demo_students.add(new Demo_Student("123",1));
            demo_students.add(new Demo_Student("123",1));
            demo_students.add(new Demo_Student("123",1));
            demo_students.add(new Demo_Student("123",1));
            System.out.println(demo_students.size());//通过结果都存进去了

            //这样不能保证唯一

            //重写equals方法，不能成功的处理
            /*
            底层是通过Hash算法判断
            所以再重写一个hashCode（）方法
            成功调用equals方法


            如果hashCode()方法不相同，就不会去比较
            每次添加都会计算一个随机的值
            1.
            如果hashCode的值是需要比较属性，可以减小比较次数
            但是如果该属性相同还是不能减小比较的次数
            2.
            所以可以采用，name.hashCode()+age之类的方法作为code的值
           3.
           尽量让他不重复
           可以再加个final int Num
           name.hashCode*Num+age
          4.在实际开发中，这些都不用我们想
            可以像生成get/set方法一样生成hashCode和equals
             之所以生成hashCode方法复杂，减小调用equals方法

             为什么是31
            1.31是一个质数，只能被1和自己本身除以的数
            2.31既不大也不小
            3.31好算，是2的5次方-1


             */

            /*
            @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo1_HashSet that = (Demo1_HashSet) o;
        return Objects.equals(name, that.name);
    }

    总结：属性相同值必须相同，属性不同的值尽量不同
        减小equal方法使用
             */

        }
    }
}
