package day03;

import java.util.Scanner;

/**
 * 键盘录入联系
 */
public class Test1_Scanner {
    public static void main(String[] args) {
        /**
         * 案例
         *  1.录入两个数，并对两个数据求和，输出其结果
         *  2.录入两个数，求最大值
         */
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        //获得求和
        System.out.println(x+y);
        //获得最大值
        System.out.println((x>y)?x:y);
        //是否相同
        System.out.println(x==y);
        //录入三个数比较最大值
        int z = scanner.nextInt();
        int temp = (x>y)?x:y;
        int max = (temp>z)?temp:z;
    }
}
