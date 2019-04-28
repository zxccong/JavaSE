package day03;

/**
 * 逻辑运算符的基本用法
 */
public class Demo1_Operator {
    public static void main(String[] args) {
        //&,|,^,!

        //&逻辑与& 并且and
        /*int a=10;
        int b=20;
        int c=30;

        System.out.println(a<b& b<c);//true&true true
        System.out.println(a<b& b>c);//true&false false
        System.out.println(a>b& b<c);//false&true false
        System.out.println(a>b& b>c);//false&false false*/
//     遇到false则false


        //逻辑或 |
        /*int a=10;
        int b=20;
        int c=30;

        System.out.println(a<b|b<c);//true&true true
        System.out.println(a<b| b>c);//true&false true
        System.out.println(a>b| b<c);//false&true true
        System.out.println(a>b| b>c);//false&false false*/
        //遇true则true

        //逻辑异或^
        /*int a=10;
        int b=20;
        int c=30;

        System.out.println(a<b^b<c);//true&true false
        System.out.println(a<b^ b>c);//true&false true
        System.out.println(a>b^ b<c);//false&true true
        System.out.println(a>b^ b>c);//false&false false*/
//        相同就为false不同就为true

        //逻辑非
        System.out.println(!true);



    }
}
