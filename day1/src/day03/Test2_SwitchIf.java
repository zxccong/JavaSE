package day03;

import java.util.Scanner;

/**
 * switch和if的练习
 */
public class Test2_SwitchIf {
    public static void main(String[] args) {
        /**
         * 输入月分判断季节
         */
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        //合理利用穿透
        switch (i){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
             default:
                 System.out.println("没有对应的季节");
                 break;
        }


        if (i>12||i<1){
            System.out.println("没有对应季节");
        }else if (i>=3){

        }
    }
}
