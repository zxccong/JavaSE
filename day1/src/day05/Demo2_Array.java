package day05;

/**
 *      栈（小一点）
 *         存储局部变量
 *         局部变量：是定义在方法声明上和方法中的变量
 *     堆（比较大）
 *         存储new出来的数组或对象
 *     方法区
 *         面向对象讲解：相当于我们的代码区
 *     本地方法区
 *         和系统相关
 *     寄存器
 *         给cpu使用
 */
public class Demo2_Array {
    public static void main(String[] args) {
        int[] arr = new int[3];    //动态初始化，创建3块连续的内存空间，栈

//        流程分析
        /**
         * 栈是先进后出
         * main 方法进栈
         *int[] arr进入主函数的区域
         *
         * new int[3] 进入堆分配地址值
         *
         * 把地址值赋值给arr
         *
         *
         */

        System.out.println(arr);
        arr[0]=1;
        arr[1]=1;

        /**
         * 流程分析
         * 栈是先进后出
         * main 方法进栈
         *int[] arr进入主函数的区域(方法内的局部变量)
         *
         * new int[3] 进入堆分配地址值
         *
         * 把地址值赋值给arr
         *
         *
         */
        
        //三个引用两个数组
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] arr3 = arr2;
        System.out.println("arr1 = " + arr1);
        System.out.println("arr2 = " + arr2);
        System.out.println("arr3 = " + arr3);

        //arr3的值，和arr2的值一样，地址也一样

        /**
         * 流程分析
         *      main进栈
         *          int[] arr1  分配空间 指向堆内存
         *          int[] arr2  分配空间 指向堆内存
         *          int[] arr3  指向arr2堆内存
         */


    }
}
