package Array;

import java.util.Arrays;

/*
冒泡排序：
1.比较数组中两个相邻的元素，如果第一个数比第二个数大就交换位置
2.每一次比较都会产生一个最大或者最小的数
3.下一轮至少可以少排序一次
4.依次循环直到结束
 */
public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] a = {1,2,3,6,5,4,7,8,9};

        //调用sort方法
        int[] sort = sotr(a);
        System.out.println(Arrays.toString(sort));
    }
//降序排序
    public static int[] sotr(int[]array){
        //定义临时变量
        int temp = 0;
        boolean flag = false;
        //外层循环控制循环多少次
        for (int i = 0; i < array.length-1 ; i++) {

            //内层循环比较两个数的大小（降序排序）
            for (int j = 0; j < array.length-1-i ; j++) {
                if (array[j+1]>array[j]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    flag = true;
                }
            }
            if (flag==false){
                break;
            }
/*
            boolean flag = false;
            if (flag==false){
                break;
            }
起到优化作用，当已经排序好后最后一次循环不用进行
 */
        }
        return array;
    }
//升序排序
//public static int[] sotr(int[]array){
//    //定义临时变量
//    int temp = 0;
//    //外层循环控制循环多少次
//    for (int i = 0; i < array.length-1 ; i++) {
//
//        //内层循环比较两个数的大小（降序排序）
//        for (int j = 0; j < array.length-1-i ; j++) {
//            if (array[j+1]<array[j]){
//                temp = array[j+1];
//                array[j+1] = array[j];
//                array[j] = temp;
//            }
//        }
//
//    }
//    return array;
//}
}
