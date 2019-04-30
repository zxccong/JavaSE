package day4;

/**
 * 控制跳转语句
 */
public class Demo1_Mark {
    public static void main(String[] args) {
        out:for (int i = 0; i < 4; i++) {
//            System.out.println("i = " + i);  //标号，只要是合法标识符即可
            in:for (int j = 0; j < 10; j++) {
                System.out.println("j = " + j);
                break out;
            }
        }
    }
}
