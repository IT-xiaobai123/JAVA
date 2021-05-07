package Array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int sum = 0;
        //声明一个数组
        int[] nums;
        //创建一个数组
        nums = new int[5];

        //int[] nums = new int[5];

        //给数组赋值
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);

    }
}
