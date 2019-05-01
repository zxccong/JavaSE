package day05;

/**
 *数组的操作
 */
public class Demo4_Array {

    public static void main(String[] args) {
        //遍历
        int[] arr ={11,22,33,44,55};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
    //提取成方法
    public void getPrint(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //获得最值
    public int getMax(int[] arr){
        int max =arr[0];    //记录的时候应该记录数组中的数据
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    //数组反转
    public void getReverseArray(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
//            arr[i]和arr[length-i]
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }

    //根据索引返回对应的星期
    public char getWeek(int week){
        char[] arr = {' ','1','2','3','4'};
        return arr[week];
    }

    //查找元素索引
    public int find(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==value){
                return i;
            }
        }
        return -1;
    }

}
