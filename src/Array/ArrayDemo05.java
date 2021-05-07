package Array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        int[][] array = {{1,2},{3,4},{5,6}};

//        for (int i = 0; i < array.length ; i++) {
//            for (int j = 0; j < array[0].length; j++) {
//                System.out.print(array[i][j]+" ");
//
//            }
//            System.out.println();
        //调用方法
        ptintArray(array);
    }




    //定义一个打印多维数组方法
    public static void ptintArray(int array[][]){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");

            }
            System.out.println();
      }
   }
}
