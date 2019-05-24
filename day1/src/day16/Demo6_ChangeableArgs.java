package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 可变参数
 * * A:可变参数概述
 *    	* 定义方法的时候不知道该定义多少个参数
 *    * B:格式
 *    	* 修饰符 返回值类型 方法名(数据类型…  变量名){}
 *    * C:注意事项：
 *    	* 这里的变量其实是一个数组
 *    	* 如果一个方法有可变参数，
 *    	并且有多个参数，那么，可变参数肯定是最后一个
 */
public class Demo6_ChangeableArgs {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        print(arr);
//        print(11,22,1);//底层封装成一个数组
        print();    //可以传空




        /*
        集合框架(Arrays工具类的asList()方法的使用)(掌握)
  * A:案例演示
  	* Arrays工具类的asList()方法的使用
  	* Collection中toArray(T[] a)泛型版的集合转数组

         */

        List<int[]> list = Arrays.asList(arr);
        //数组转集合
//        list.add(1);报错不支持修改异常
        //不能增加和减小元素，可以用集合的思想操作数组
        //可以使用集合中的方法
        //基本数据类型的数据会将整个数组当作一个对象转换
        //想将数组转换成集合，必须是应用数据类型
        //基本数据类型可以通过包装类进行


        //集合转数组Collection toArray
        ArrayList<Object> list1 = new ArrayList<>();
        //转换成了字符串的数组
        String[] strings = list.toArray(new String[0]);//当集合转换数组时，数组的长度如果时小于等于集合的size时，
                                                        // 转换后的数组长度等于集合的size，如果大于size,分配的数组就和你指定的数组长度一样
        //数据是不能直接打印的
        for(String string:strings){
            System.out.println(string);
        }

    }
//    public static void print(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }

    //参数一样，所以报错，可变参数就是个数组
    public static void print(int ... arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //如果一个方法有可变参数，
    // 并且有多个参数，那么，可变参数肯定是最后一个(不能更换位置)
    public static void print(int a,int b,int ... arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
