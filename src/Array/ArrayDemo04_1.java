package Array;

import java.util.Arrays;

public class ArrayDemo04_1 {
    public static void main(String[] args) {
        int [] arrays = {1,2,3,4,5};
        //调用方法
        int[] reverse = reverse(arrays);
//        for (int x:reverse){
//            System.out.print(x+" ");
//        }
//        for (int i = 0; i < reverse.length; i++) {
//            System.out.print(reverse[i]+" ");
//        }
        System.out.println(Arrays.toString(reverse));
    }

    //数组反转
    public static int[] reverse(int[]arrays){
        int [] result = new int[arrays.length];
        for (int i = 0,j = result.length-1; i < arrays.length; i++,j--) {
            result[j] = arrays[i];
        }
        return result;
    }
}
