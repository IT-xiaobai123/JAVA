package ArraySort;

import java.util.Arrays;

/*
快速排序法：
·分治法:比大小,再分区
1． 从数组中取出一个数，作为基准数。
2． 分区:将比这个数大或等于的数全放到他的右边，小于他的数全放到他的左边。
3.再对左右区间重复第二步，直到各区间只有一个数。
 */
public class ArraySort5 {
    public static void main(String[] args) {
        int []arr = {5,3,6,8,9,4,1,2,7};
        ArraySort5.quicSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }



    private static void quicSort(int[]arr,int start,int end) {



        //找出分左右两区的索引位置，然后对左右两区进行递归调用
        if (start<end){
            int index = getIndex(arr,start,end);//找到索引位置
            quicSort(arr,start,index-1);//从左往右找
            quicSort(arr,index+1,end);//从右往左找
        }


    }

    private static int getIndex(int[] arr, int start, int end) {
        int i = start;//第一个索引
        int j = end;//最后一个索引
        int x = arr[i];//基准数

        while (i<j){
            //由后向前找比它小的数，找到后挖出此数填到前一个坑
            while (i<j&&arr[j]>=x){
                j--;//向前跑
            }
            if (i<j){
                arr[i] = arr[j];
                i++;//向后跑
            }
            //由前向后找比它大或等于的数，找到后也挖出此数填到前一个坑中
            while (i<j&&arr[i]<x){
                i++;//向后跑
            }
            if (i<j){
                arr[j] = arr[i];
                j--;//向前跑
            }
        }
        arr[i] = x;//把基准数填到最后一个坑



        return i;//返回索引
    }
}
