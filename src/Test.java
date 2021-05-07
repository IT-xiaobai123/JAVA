import java.util.Scanner;

import static java.lang.Math.abs;

public class Test {
    private int result;

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test);

    }
    public int twoSum(int[] nums, int target, int start) {

        for (int i = 0; i < nums.length; i++) {
            int result=0;
            if(nums[i]==target||start<nums.length){
                result = abs(i-start);

            }

        }
        return result;
    }


}
//    public int[] twoSum(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//               if (target-nums[i]==nums[j]){
//                   return new int[]{i,j};
//               }
//            }
//
//        }
//        throw new IllegalArgumentException("找不到两个数的和");
//    }







