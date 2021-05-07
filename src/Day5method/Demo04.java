package Day5method;
//递归
public class Demo04 {
    public static void main(String[] args) {

        System.out.println(f(5));

    }

    //5!  5*4*3*2*1

    public static int f(int n){

        if (n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
}
