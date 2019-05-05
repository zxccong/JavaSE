package day07;

/**
 * 查询文档学习Math类中的随机类
 */
public class MathTest {
    public static void main(String[] args) {

        //生成大于等于0.0并且小于1.0的伪随机数
        for (int i = 0; i < 10; i++) {double random = Math.random();
            System.out.println("random = " + random);
        }
    }
}
