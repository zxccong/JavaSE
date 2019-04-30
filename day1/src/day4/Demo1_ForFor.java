package day4;

/**
 * 嵌套循环练习
 */
public class Demo1_ForFor {
    public static void main(String[] args) {

        //输出四行五列的星
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //打印正三角形
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" * "+i+" = "+(j*i)+"\t");
            }
            System.out.println();
        }
        //windows系统里面/r/n才表示换行/r表示行首/n表示换行

    }
}
