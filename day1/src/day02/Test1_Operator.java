package day02;

/**
 * ++ --的面试题
 */
public class Test1_Operator {
    public static void main(String[] args) {
        //第一题
        /*int a=10;
        int b=10;
        int c=10;
        a =b++;     //a=10 b = 11 c = 10
        c = --a;    //a=9 b =11 c=9
        b =++a;     //a=10 b=10 c=9
        a =c --;    //a=9 b =10 c=8*/

        //第二题
       /* int x = 4;
         //       4     6     60
        int y = (x++)+(++x)+(x*10);*/

       //第三题 那句话会报错
        byte b = 127;
        b ++;       //b = (byte)(b+1)底层会加一个强制转换符 通过127 ++可以看到真的是强制类型转换
        System.out.println(b);
//        b = b +1; byte和int 运算会提升精度


    }
}
