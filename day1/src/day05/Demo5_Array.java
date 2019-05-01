package day05;

/**
 *二维数组
 */
public class Demo5_Array {

    public static void main(String[] args) {
        /*
        二维数组的格式
        int[][] arr =new int [3][2];
        注意事项
            二维数组
                1.数据类型 数组名【】【】=new 数据类型【m】【n】;
                2.数据类型【】 数组名【】 =new 数据类型【m】【n】;

         */

        int[][] arr = new int[3][2];
        /*
        二维数组
        二维数组有3个一维数组，每个一维数组里面有2个数
         */
        System.out.println(arr);            //二维数组的地址值
        System.out.println(arr[0]);         //一维数组地址值
        System.out.println(arr[0][0]);      //元素值

        /*

        堆栈信息

        创建一位数组
        每一个一维数组存放一个一维数组的地址值
        后面的地址是实际存放值

         */

        //格式二
        //int[][] arr =new int[3][];
        int[][] arr2 = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[10];

        //格式三
        //int[][] arr = {{1,2,3,},{4,5},{6,7,8,9}}
        int[][] arr3 = {{1, 2, 3,}, {4, 5}, {6, 7, 8, 9}};

        //遍历二维数组
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        //求和
        for (int i = 0; i < arr3.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr3[i].length; j++) {
                sum += arr3[i][j];

            }
            System.out.println(sum);
        }
    }
}
