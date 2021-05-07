package Day5method;

/**
 * @author 86183
 */
public class Demo03 {
    public static void main(String[] args) {
        print(4,5,6,7,8);
        print(1,2,3,4);



    }

    public static void print(double...number){
        if (number.length == 0){
            System.out.println("no argument passed");
            return;
        }

        double result = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i]>result){
                result = number[i];
            }

        }
        System.out.println("The max vale is"+ result);

    }
}
