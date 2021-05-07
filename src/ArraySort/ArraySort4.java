package ArraySort;

import java.util.Arrays;

/*
希尔排序：是对插入排序的优化,有称缩小版插入排序，通过选取一个合适的增量。
逐步减小增量，直到增量为1.最后通过插入排序完成排序
 */
public class ArraySort4 {
    public static void main(String[] args) {
        int []arr = {21,8,7,15,9,26,23};

        int[] arr1 = shellSort(arr);
        System.out.println(Arrays.toString(arr1));
    }

    private static int[] shellSort(int[] arr) {

        //定义增量，增量选取一般是按照数组长度的一般开始，但这不是最高效。
        //用克努特序列选取增量：h=1，h=h*3+1
        int h = 1;
        int temp =0;
        while (h<=arr.length/3){
            h = h*3+1;

        }
        //第一层循环确定增量次数
        for (int i = h; i >0 ; i=(i-1)/3) {
            //第二层循环确定循环次数
            for (int j = i; j < arr.length ; j++) {
                //第三层循环确定元素大小
                for (int k = j; k >i-1 ; k-=i) {
                    if (arr[k]<arr[k-i]){
                        temp = arr[k];
                        arr[k] = arr[k-i];
                        arr[k-i] = temp;

                    }

                }

            }
            
        }


        return arr;
    }
}
