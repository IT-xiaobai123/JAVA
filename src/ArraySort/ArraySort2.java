package ArraySort;

import java.util.Arrays;

/*
数组之选择排序
排序原理:从0索引处开始，依次和后面的元素进行比较，小的元素往前放，经过一轮比较后，最小的元素就出现在了最小索引处
 */
public class ArraySort2 {
    public static void main(String[] args) {
        int[] arr = {3,5,6,8,4,2,1,9,10,7};


        int[] arr1 = sortChoice(arr);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = sortChoice1(arr);
        System.out.println(Arrays.toString(arr2));


    }
//升序
    private static int[] sortChoice(int[] arr) {

        for (int index = 0; index <arr.length-1 ; index++) {

            for (int i = 1 + index; i < arr.length; i++) {

                int temp = 0;
                if (arr[index] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                }

            }
        }
        return arr;
    }

    //降序
    private static int[] sortChoice1(int[] arr) {

        for (int index = 0; index <arr.length-1 ; index++) {

            for (int i = 1 + index; i < arr.length; i++) {

                int temp = 0;
                if (arr[index] <arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                }

            }
        }
        return arr;
    }

//    private static void extracted(int[] arr) {
//        //第一轮
//        int index = 0;
//        for (int i = 1+index; i < arr.length-1 ; i++) {
//
//            int temp = 0;
//            if (arr[index]> arr[i]){
//                temp = arr[i];
//                arr[i] = arr[index];
//                arr[index] = temp;
//            }
//
//        }
//
//        //第二轮
//        index = 1;
//        for (int i = 1+index; i < arr.length-1 ; i++) {
//
//            int temp = 0;
//            if (arr[index]> arr[i]){
//                temp = arr[i];
//                arr[i] = arr[index];
//                arr[index] = temp;
//            }
//
//        }
//
//        //第三轮
//        index = 2;
//        for (int i = 1+index; i < arr.length-1 ; i++) {
//
//            int temp = 0;
//            if (arr[index]> arr[i]){
//                temp = arr[i];
//                arr[i] = arr[index];
//                arr[index] = temp;
//            }
//
//        }
//
//        //第四轮
//        index = 3;
//        for (int i = 1+index; i < arr.length-1 ; i++) {
//
//            int temp = 0;
//            if (arr[index]> arr[i]){
//                temp = arr[i];
//                arr[i] = arr[index];
//                arr[index] = temp;
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));
//    }
}
