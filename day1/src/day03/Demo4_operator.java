package day03;

/**
 * 位异或运算符的特点和面试题
 */
public class Demo4_operator {
    public static void main(String[] args) {
        /**
         * 一个数对同一个数位移或2次，数本身不变
         */
        System.out.println(5^10^10);
        /**
         * 面试题 ：请实现两个整数交换（不需要定义第三放变量）
         *
         */
        int x= 10;
        int y=5;
        //方法一
        x=x+y;      //10+5=15
        y=x-y;      //15-5=10
        x=x-y;      //15-10=5
        //数足够到有可能超过int的取值范围

        x=x^y;     //10^5
        y=x^y;      //10^5^5
        x=x^y;      //10^5^10

    }
}
