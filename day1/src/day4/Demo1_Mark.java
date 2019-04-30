package day4;

/**
 * 控制跳转语句
 */
public class Demo1_Mark {
    public static void main(String[] args) {
        out:
        for (int i = 0; i < 4; i++) {
//            System.out.println("i = " + i);  //标号，只要是合法标识符即可
            in:
            for (int j = 0; j < 10; j++) {
                System.out.println("j = " + j);
                break out;
            }
        }

        //拓展
        //http://www.baidu.com
        //http:标号，//hoho

        //练习题
        for (int i = 0; i < 10; i++) {
            if (i%3==0){
                //break; 输出3次
                //continue; 输出7次
                System.out.println("Java基础班");
            }
            System.out.println("Java基础班");
        }
    }
}
