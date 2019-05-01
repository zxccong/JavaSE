package day05;

/**
 * 思考题Java中参数的传递
 */
public class Test_Array {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        System.out.println("a = " + a+",b = "+b); //a=10 b=20
        chang(a,b);
        System.out.println("a = " + a+",b = "+b); //a=10 b=20
        int[] arr= {1,2,3,4,5};
        change2(arr);
    }

    private static void change2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0) {
                arr[i]*=2;
            }
        }
    }

    private static void chang(int a, int b) {
        System.out.println("a = " + a+",b = "+b); //a=10 b=20
        a=b;
        b=a+b;
        System.out.println("a = " + a+",b = "+b); //a=20 b=40
    }

    //原理分析
    /**
     * 栈
     * main方法压栈
     * int a= 10
     * int b=20
     * change方法压栈
     * int a=20
     * int b=40
     * 方法执行完change出栈
     * 总结：基本数据类型的值传递，不改变原值，不改变原值，因为调用后就会弹栈，局部变量随之消失
     */

    //原理分析
    /**
     * 栈
     * int[] arr
     * 指向堆中的地址
     *
     * 方法change2压栈后改变了
     * int[] arr的值
     *
     * change2弹栈后，int[] arr没有随之消失
     * 总结：引用数据类型，值传递改变原值
     *
     */
    /*
    Java中到底传值还是传值
        1.既是传值，也是传址，基本数据类型传递值，引用数据类型的传递的地址
        2.java中只有传值，因为地址值也是值
     */


}
