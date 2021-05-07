package Day4;

/**
 * @author 86183
 */
public class ForDemo {
    public static void main(String[] args) {
          //计算0-100之间奇数和，偶数和
        //奇数
        int oddSum = 0;
        //偶数
        int evenSum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i%2!=0){
                oddSum = oddSum+i;
            }else {
                evenSum = evenSum+i;
            }

        }
        System.out.println(oddSum);
        System.out.println(evenSum);

        //用for循环输出1-1000能被5整除的数。并且每行输出3个
        for (int i = 0; i <= 1000; i++) {
            if (i%5==0){
                System.out.print(i+"\t");
            }
            if (i%(5*3)==0){
                System.out.println("\n");
            }

        }

        //用while循环输出1-1000能被5整除的数。并且每行输出3个
        int a=0;
        while (a<=1000){
            if (a%5==0){
                System.out.print(a+"\t");
            }
            if (a%(5*3)==0){
                System.out.println("\n");
            }
            a++;

        }
        //打印九九乘法表
        //print不换行
        //println换行

        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(i+"*"+j+"="+(j*i)+"\t");
            }
            System.out.println();
        }
        //遍历数组元素
        int [] number = {10,20,30,40,50};
        for (int i = 0;i<5;i++){
            System.out.println(number[i]);
        }
        //增强for循环
        for (int x:number){
            System.out.println(x);
        }



    }
}
