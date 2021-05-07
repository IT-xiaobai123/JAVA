package Array;

import java.util.Scanner;

/*
需求:公司年销售额求和
某公司按照季度和月份统计的数据如下:单位(万元)
第一季度:22,66,44
第二季度:77,33,88
第三季度:25,45,65
第四季度:11,66,99
 */
public class ArraySum {
    public static void main(String[] args) {
        int [][]arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                sum = sum+arr[i][j];
            }

        }
        System.out.println(sum);

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        /*
        打印杨辉三角：行数可以有键盘输入

        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1
        1 5 10 10 5 1
        每一行第一个元素和最后一个元素都为1
        从第三行第二列开始，每一个元素等于上一行前一个元素和本列之和
         */

        Scanner sc = new Scanner(System.in);
        //定义行数
        System.out.println("请输入行数");
        int n = sc.nextInt();

        //定义二维数组存放值
        int [][]arr1 = new int[n][n];

        //每一行第一个元素和最后一个元素都为1
        for (int i = 0; i < arr1.length; i++) {
            arr1[i][0] = 1;
            arr1[i][i] = 1;

        }

        //打印中间值：从第三行第二列开始，每一个元素等于上一行前一列元素和上一行本列元素之和

        for (int i = 2; i < arr1.length; i++) {
            for (int j = 1; j <= i; j++) {
               arr1[i][j] = arr1[i-1][j-1]+arr1[i-1][j];
            }

        }


        //遍历数组
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }




    }
}
