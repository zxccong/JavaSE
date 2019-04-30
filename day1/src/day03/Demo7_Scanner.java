package day03;

import java.util.Scanner;

/**
 * 键盘录入
 */
public class Demo7_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个整数");
        int x =scanner.nextInt();
        System.out.println(x);
        //录入第二个整数
        int y =scanner.nextInt();
    }
}
