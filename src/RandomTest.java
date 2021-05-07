import java.util.Arrays;
import java.util.Random;
/*
中国福利彩票系统
 */
public class RandomTest {
    public static void main(String[] args) {
        System.out.print("红球:");

        int[] redball = randomCommon(1,33,6);
        System.out.println(Arrays.toString(redball));

        System.out.print("蓝球:");
        RandomTest.getBuleBall();

    }

    public static int[] randomCommon(int min, int max, int n){


        if (n > (max - min + 1) || max < min) {
            return null;
        }
        int[] result = new int[n];
        int count = 0;
        while(count < n) {
            int num = (int) (Math.random() * (max - min)) + min;
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if(num == result[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                result[count] = num;
                count++;
            }
        }
        return result;
    }

    //获得蓝球
    public static void getBuleBall(){
        Random number = new Random();
          int max = 16;
          int min = 1;
        int BuleBall = number.nextInt(max)%(max-min+1)+1;

        System.out.print("["+BuleBall+"]");


    }
}
