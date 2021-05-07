package Array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int [] arrays = {1,2,3,4,5};

       printArrays(arrays);
    //  打印换行
        System.out.println();
        int [] reverse = reverse(arrays);

        printArrays(reverse);
    }
    //打印数组
    public static void printArrays(int []arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }

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
