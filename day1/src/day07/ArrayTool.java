package day07;

/**
 * 工具类
 */
public class ArrayTool {

    //1.获得最大值
    public static int getMax(int[] arr){
        int max =  arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    //2.遍历数组
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " + arr[i]);
        }
    }
    //3.数组反转
    public static void revArray(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
//            arr[i]和arr[length-i]
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }



}
