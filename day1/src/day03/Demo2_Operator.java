package day03;

/**
 * 逻辑运算符&&与&的区别
 */
public class Demo2_Operator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;

        System.out.println(a<b^b<c);//true&true false
        System.out.println(a<b^ b>c);//true&false true
        System.out.println(a>b^ b<c);//false&true true
        System.out.println(a>b^ b>c);//false&false false
    }
}
