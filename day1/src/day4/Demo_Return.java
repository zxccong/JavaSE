package day4;

/**
 *
 */
public class Demo_Return {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==4){
//                break;
                return; //返回的意思 直接接受main函数
            }
        }
        System.out.println("循环结束");

        //面试：return 和break以及continue区别
        //return结束方法
        //break跳出循环
        //continue是终止本次循环继续下次循环


    }
}
