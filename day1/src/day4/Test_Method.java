package day4;

import java.util.Scanner;

/**
 *函数练习
 *
 * 获取2个数的最大值
 *
 * 获得两个数是否相等
 */
public class Test_Method {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x= scanner.nextInt();
        int y = scanner.nextInt();

    }
    //获得最大值
    public int getMax(int a, int b ){
        return (a>b)?a:b;
    }
    //判断是否相等
    public boolean isEquest(int a ,int b){
        return a==b;
    }
    //输入行数、列数输出星型
    //单独调用（可以）
    //输出调用（错误）
    //赋值错误（错误）
    public void printStar(int row,int column){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
        //返回值为void 可以省略return系统调用
    }

    //输入参数获得九九乘法表
    public void printMultiplicaiton(int x){
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" * "+i+" = "+(j*i)+"\t");
            }
            System.out.println();
        }
    }



}
