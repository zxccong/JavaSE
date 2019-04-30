package day03;

/**
 * 三目运算符
 */
public class Demo6_Operator {
    public static void main(String[] args) {
        //(关系表达式)？表达式1 ：表达式2
        int x =10;
        int y = 5;
        int z ;
        z = (x>y) ?x :y;
        /**
         * 案例
         *  1比较两个整数是否相同
         *  2.获取三个整数的最大值
         */

        //比较是否相同
//        boolean b = (x==y)? true:false;
//        boolean b= (x==y);

        //获取三个整数的最大值
        int a = 10;
        int b =20;
        int c=30;
         //比较两个值的最大值
        int temp = (a>b) ?a :b;
        int max = (temp>c )? temp:c;


    }
}
