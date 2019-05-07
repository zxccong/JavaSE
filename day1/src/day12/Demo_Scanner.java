package day12;

import java.util.Scanner;

/**
 * Scanner类的运用
 */
public class Demo_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        可能出现
        InputMismatchException输入不同类型，标记类型和期望类型不匹配
        int i = scanner.nextInt();
        System.out.println("i = " + i);*/
        /*if (scanner.hasNextInt()){      //判断是不是整形
            int i = scanner.nextInt();
            System.out.println("i = " + i);
        }else{
            System.out.println("输入类型错误");
        }*/
        //只录入整数没问题
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        //只录入字符串没问题
        String s = scanner.nextLine();
        String s2 = scanner.nextLine();

        //同时录入整数和字符串有问题
        /*
        int i = scanner.nextInt();
        String s = scanner.nextLine();

        nextInt()是键盘录入整数的方法，当我们录入整数时
        其实在键盘上录入10和\r\n  nextInt()结束了
        nextLine(); 是字符串方法，用来接收一行数据，但是它凭什么获取一行呢？
        通过\r\n只要遇到\r\n就证明了一样结束了

         */
        /*
        解决方案：1.创建两个Scanner对象
                  2.键盘录入都是字符串。都用nextLine方法，在转换为int
         */
//        s.compareToIgnoreCase()



    }
}
