package day02;

/**
 * 类型转换
 */
public class DataTypeConversion {
    public static void main(String[] args) {
        //数据类型转换只隐式转换

        int x = 3 ;
         byte b = 4;
         x=x+b;

        System.out.println(x);
        //能够做到
        //解析
        //bit 4 00000100
        //int 3 00000000 00000000 00000000 00000011

        //底层 bit 00000000 0000000 00000000 00000100
        //     int 00000000 0000000 00000000 00000011
        //实现了隐式转换

        //小的数据类型和大的数据类型进行运算的时候就会隐式转换

        //强制类型转换转换
        byte b1 =4 ;
        int x1=3;
//        b = x +b; 报错：可能损失精度
        b1 = (byte) (x1 +b1);

        //强制类型转换之超出范围
        byte b2= (byte) (126 +4);//->-126
        //总结：向下强转有可能损失进度








    }
}
