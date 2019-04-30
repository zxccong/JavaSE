package day4;

/**
 * 方法重载
 *
 * 方法名相同，参数列表不同，与返回值的类型无关
 * 重载的分类
 *  1.参数个数不同
 *  2.参数类型不同
 *      循序不同
 */
public class Demo1_Overload {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /*
    求两个整数的和
    参数列表 int a,int b
     */
    public static int add(int a,int b){
        return a+b;
    }

    /*
    求三个整数的和
    参数列表 int a,int b,int c
     */
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    //参数类型不同
    public static double add(double a,int b,int c){
        return a+b+c;
    }

    //顺序不同
    public static double add(int b,double a,int c){
        return a+b+c;
    }

    //练习题
    public static boolean isEquals(int a,int b){
        return a==b;
    }

    public static boolean isEquals(double a,double b){
        return a==b;
    }
}
