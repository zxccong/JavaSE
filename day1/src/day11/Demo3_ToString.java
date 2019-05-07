package day11;

import day07.Demo_Student;

/**
 * Object 的toString（）
 */
public class Demo3_ToString {
    public static void main(String[] args) {
        Demo_Student s = new Demo_Student("张三",23);
        String s1 = s.toString();
        //return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //左边类名   右边hashCode 的十六进制表现形式
        //一般进行重写
        //默认会调用重写后的toString ()方法
        //重写toString()方便显示属性值
        System.out.println("s1 = " + s1);
    }
}
