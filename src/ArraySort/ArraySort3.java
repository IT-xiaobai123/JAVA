package ArraySort;

import java.util.Arrays;

/*
直接插入排序，从1索引开始
 */
public class ArraySort3 {
    public static void main(String[] args) {
        int []arr = {21,8,7,15,9,26,23};
        int[] arr1 = sortInsert(arr);
        System.out.println(Arrays.toString(arr1));

        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0 ; j--) {
                if (arr[j]>arr[j-1]){
                    temp  = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    private static int[] sortInsert(int[] arr) {
        int temp = 0;

        for (int i = 1; i < arr.length; i++) {

            int j = i;

           while (j>0&&arr[j]>arr[j-1]){
                temp  = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        return arr;
    }


}
