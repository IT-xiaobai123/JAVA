package Array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int [] a = {1,5,3};

        int [] b = {1,5,3};
        //数组填充
        Arrays.fill(a,5);
        //数组排序（升序）
        Arrays.sort(a);

        System.out.println(Arrays.equals(a,b));
        /*
        Arrays.binarySearch(Object[],val)用法
        Object[]:数组名；val:检索值
        Arrays.equals(type[],type[]),返回值是布尔型
         */

        //打印数组Arrays.toString()
        System.out.println(Arrays.toString(a));
    }
}
