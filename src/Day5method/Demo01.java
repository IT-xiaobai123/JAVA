package Day5method;

public class Demo01 {
    /**
     * 定义main方法
     */

    public static void main(String[] args) {
        //调用add方法
//        int sum = add(1,2);
//        System.out.println(sum);
//
//        int add=Demo01.add(2,2);
//        System.out.println(add);




        test();//调用test方法

        //调用max方法
        int max = max(1,10);

        System.out.println(max);
    }


    /**
     * 定义add方法
     */

    public static int add(int a,int b){
        return a+b;
    }
    /**
     * 定义test方法
     */

    public static void test(){
        for (int i = 1; i <= 1000; i++) {
            if (i%5==0){
                System.out.print(i+"\t");
            }
            if (i%(5*3)==0){
                System.out.println("\n");
            }

        }

    }
    /**
     * 定义一个比较大小的数
     */

    public static int max(int a,int b){
        int result = 0;
        if (a==b){
            System.out.println("a==b");
            return 0;//终止方法
        }
        if (a>b){
            result = a;
        }else {
            result = b;
        }
        return result;
    }
}
