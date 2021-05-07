package Day4;

/**
 * @author 86183
 */
public class WhileDemo01 {
    public static void main(String[] args) {
        //输出1-100
        int i = 0;
//        while (i<100){
//            i++;
//            System.out.println(i);
//        }

        //计算1+2+3+4+...+100
        int sum = 0;
        while (i<=100){

            sum = sum + i;
            i++;


        }
        System.out.println(sum);

    }
}
