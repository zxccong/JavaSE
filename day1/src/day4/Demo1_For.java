package day4;

/**
 *for的概念和格式
 */
public class Demo1_For {

    public static void main(String[] args) {
        /*
            循环的分类：for ,while,do…while
        格式
            for(初始化表达式；条件表达式；循环后的操作表达式){

            }
        执行流程：
            执行初始化语句
            判断条件
            执行循环体
            执行循环后操作表达式
            回到判断条件
        */
        for (int i =0;i<10;i++){
            System.out.println("hello "+i);
        }

    }
}
