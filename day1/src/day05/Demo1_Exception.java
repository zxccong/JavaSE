package day05;

/**
 *数组中常见的异常
 */
public class Demo1_Exception {

    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsEception数组索引越界异常
        /**
         * 原因：你访问了不存在的索引
         * Null PointerException空指针异常
         * 原因：数组已经不再指向堆内存了，你还去用数组名访问元素
         * int[] arr = {1,2,3}
         * arr =null
         * sout(arr[0])
         */

        int[] arr =new int[5];
        System.out.println(arr[5]);//ArrayIndexOutOfBoundsEception数组索引越界异常

        arr=null;
        System.out.println(arr[0]);//Null PointerException空指针异常


    }
}
