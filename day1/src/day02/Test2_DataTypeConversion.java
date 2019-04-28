package day02;

public class Test2_DataTypeConversion {
    public static void main(String[] args) {
        float f = 12.3f;
        long x = 123456L;
        f = x;              //隐式转换
        System.out.println(f);

        x = (long) f;       //强制转换

        /*
        * float 占用4个字节
        *
        * 32个二进制位
        * 1位代表符号为
        * 23位代表尾数为
        * 8位代表指数位
        * IEEE 754
        * 0-255
        * 0代表0
        * 255代表无穷大
        * 1-254
        * -126 -127范围
        * float 取值范围比long 大
        *
        * */
    }
}
