package day12;



/**
 * String
 */
public class Demo_String {
    public static void main(String[] args) {

        String str = "123";
        //可以看成一个字符串对象
        str ="abc";     //当把abc 赋值给str 之后之前的123就成了垃圾
                        //不想类中有set设置它的值，只能新创一个
        System.out.println();//默认会调用toString 方法

        /*
        A:常见构造方法
    	* public String():空构造
    	* public String(byte[] bytes):把字节数组转成字符串
    	* public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
    	* public String(char[] value):把字符数组转成字符串
    	* public String(char[] value,int index,int count):把字符数组的一部分转成字符串
    	* public String(String original):把字符串常量值转成字符串
         */

        String s1 = new String();
        System.out.println(s1);

        byte[] arr1 = {91,92,93};   //平台默认码表        //字节数组转换
        String s2 = new String(arr1);

        String s3 = new String(arr1, 0, 1);

        char[] chars= {'a','b','c'};                    //字符数组转换
        String s4 = new String(chars);

        String s5 = new String(chars, 0, 1);//从什么位置 开始转换多小个

        String s6 = new String("123");  //字符串常量转字符串

    }
}
