package Day4;

/**
 * @author 86183
 */
public class BreakDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100){
            i++;
            System.out.println(i);
            if(i==40){
                break;//当i等于40的时候跳出循环，并不是结束程序
            }

        }
    }
}
