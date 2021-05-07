package ArraySort;

import java.util.Arrays;

/*
冒泡排序：两两比较
排序次数比数组长度少一次
经过多轮排序，每完成一轮就会减少一次排序次数
 */
public class ArraySort1 {
    public static void main(String[] args) {
        int[] arr = {1,5,6,8,4,2,3,9,10,7};

        int[] arr1 = sortMaoPao(arr);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = sortMaoPao1(arr);
        System.out.println(Arrays.toString(arr2));
    }

    private static int[] sortMaoPao(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {

                int temp = 0;
                //升序排序
                if (arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }

            }

        }

        return arr;
    }

    private static int[] sortMaoPao1(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {

                int temp = 0;
                //降序排序
                if (arr[j]<arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }

            }

        }

        return arr;
    }
}
