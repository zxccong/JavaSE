package day03;

/**
 * 逻辑运算符&&与&的区别
 * //最终的结果是一样的左边为flase，右边不执行
 *  逻辑运算符||与|的区别
 *  * //最终的结果是一样的左边为true，右边不执行
 */
public class Demo2_Operator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        //左边为flase，右边不执行
        System.out.println(a<b&&b<c);//true&true false
        System.out.println(a<b&&b>c);//true&false true
        System.out.println(a>b&&b<c);//false&true true
        System.out.println(a>b&&b>c);//false&false false

        int x=3;
        int y=4;
//        System.out.println((++x==3)&(++y==4));//false & false ->false
//        System.out.println("x = "+x);       //x=4
//        System.out.println("y = "+y);       //y=5

        //y的值不执行
        System.out.println((++x==3)&&(++y==4));//false & false ->false
        System.out.println("x = "+x);       //x=4
        System.out.println("y = "+y);       //y=4
    }
}
