package Array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {1,2,3};
        System.out.println(a[1]);
        //动态初始化:包含默认初始化
        int[ ] b = new int[2];
        b[0]=1;
        b[1]=2;
        System.out.println(b[1]);
        String[] str = new String[2];
        //没赋值默认为null
        System.out.println(str[1]);
    }
}
