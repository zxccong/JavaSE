package day13;

import java.util.Arrays;

import static day07.ArrayTool.print;

/**
 * 数组学习
 */
public class Demo2_Array {
    public static void main(String[] args) {

        /*
        冒泡排序
         */
        int[] arr = {11,55,88,66,77,99};
        bubbleSort(arr);
//        print(arr);
        selectSort(arr);
        print(arr);
        int i =915;
        int i1 = halfSelect(arr, i);
        System.out.println("i1 = " + i1);

        Arrays.sort(arr);
        Arrays.toString(arr);
        Arrays.binarySearch(arr,i);

    }



    /**
     * 冒泡排序
     * @param arr
     */
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {        //外层循环只要比较arr.length-1次就可以了
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
        
    }

    /**
     * 选择排序
     */
    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length  ; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    /**
     * 二分查找(只能做排序好的数组)
     */
    private static int halfSelect(int[] arr, int i) {
        int min = 0;
        int max = arr.length;
        int mid = (min + max )/2;


        while (arr[mid]!=i){            //当中间值不等于要找的值，就开始循环查找
            if (arr[mid]<i){            //当中间值小于了要找的值
                min = mid +1;           //最小索引改变
            }else if (arr[mid]>i){      //中间值大于要找的值
                max = mid -1 ;          //最大索引改变
            }
            mid = (min+max)/2;          //重新计算mid中间值

            if (min>=max){               //如果最小索引大于了最大索引，就没有查找的可能性了
                return -1;
            }

        }

        return mid;
    }

}
