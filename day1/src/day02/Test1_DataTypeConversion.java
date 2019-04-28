package day02;

public class Test1_DataTypeConversion {
    public static void main(String[] args) {
        byte b1= 3;
        byte b2= 4 ;
        /*
        从两方面
        1.byte 与 byte （或short,char)进行运算的时候会提升为int 两个int 类型相加的结果也是int类型
        2.b1 和 b2 是两个变量，变量存储的值是变化的，在编译的时候无法判断里面具体的值，相加之后可能会超出byte的取值范围

         */
//        byte b3 = b1 + b2; //报错：2个 byte运算会编程int类型
        //这里不报错的话
        //java 编译器有常量优化机制
        byte b4 = 3+4;


    }
}
