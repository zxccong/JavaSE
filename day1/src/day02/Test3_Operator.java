package day02;

/**
 * 赋值运算符面试题
 */
public class Test3_Operator {
    public static void main(String[] args) {
        //面试题：看下面的程序是否问题，如果有，请指出并索命理由
//        short s= 1;s =s +1; //当short 与int 类型运算的时候会提升为int 类型
        short s1 =1;s1 +=1;     //底层实现了强制类型转换跟之前的byte++原理一样

    }
}
