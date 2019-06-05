package day19;

/**
 * 异常学习
 */
public class Demo1_Exception {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
//        arr=null;
        //NullPointerException
//        System.out.println(arr[10]);
        //java.lang.ArrayIndexOutOfBoundsException: 10
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //java.lang.ArithmeticException: / by zero
        //JDK7的处理多个异常
        try {
            System.out.println(10/0);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }finally {

        }

        System.out.println(method());
    }
    public static int method(){
        int x= 10;
        try {
             x= 20;
            System.out.println(10/0);
            return x;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
             x= 30;
            return x;
        }finally {
             x= 40;
        }
    }
}
