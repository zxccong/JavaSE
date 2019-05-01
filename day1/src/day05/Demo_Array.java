package day05;

/**
 * 数组的概念
 */
public class Demo_Array {
    public static void main(String[] args) {
        /*
        1.为什么要有数据
            为了存储同种数据类型的多个值
        2.数组的概念
            数据是存储同一种数据类型的多个元素集合。也可以看作是一个容器
            数据既可以存储基本数据类型，也可以存储引用数据类型
        3.数据的定义
            数据类型[] 数据名 = new 数据类型[数组的长度]；
         */
        int[] arr =new int[5];
        /*
        左边：
            int数据类型
            []：代表数组，几个中括号代表几维数组
            arr:：合法的标识符

            右边
            new :创建实例化对象
            int:数据类型
            【】:数组
            5：长度
         */

        //动态初始化
        //整数类型byte\short\int\long默认初始化值0
        //浮点型:float,double默认初始化值是0.0
        //布尔类型：boolean 默认初始化值是false
        //字符类型 '\u0000' 每一个代表一个16进制的0，四个0代表一个16进制二进制位
        int[] abc= new int[5];
        System.out.println(abc); //[I@19bb25a  一维数组I int类型 @右边是地址值
        //静态初始化
        int[] efg={1,2,3};
    }
}
