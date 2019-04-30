package day4;

/**
 * 嵌套循环练习
 */
public class Demo1_ForFor {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
