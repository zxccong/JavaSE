package day02;

/**
 * JAVA基本数据类型的使用
 */
public class DataType {
    public static void main(String[] args) {
        //整数类型(默认的类型是int)
        byte b =10; //占一个字节
        short s = 20 ;//占两个字节
        int i = 30;   //占四个字节
        long x = 88888L; //占八个字节默认是int 要加上L

        //浮点类型（默认的类型是double）
        float f =  12.3F; //可能损失精度，报错 占用四个字节
        double d= 33.4D;    //占用八个字节

        //字符类型
        char c = 'a'; //占用两个字节

        //布尔类型
        boolean b1 =true; //占用八分之一个字节

    }
}
