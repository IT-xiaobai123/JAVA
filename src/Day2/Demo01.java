package Day2;

public class Demo01 {
    public static void main(String[] args) {
        //++  --  自增自减 一元运算符
        int a = 3;
        int b = a++;//执行完代码后，先给b赋值，再自增
        int c = ++a;//执行代码前，先自增，再赋值


        System.out.println(a);//5
        System.out.println(b);//3
        System.out.println(c);//5
        //幂运算
        Math.pow(3,2);
        Math.pow(2,3);
        System.out.println(Math.pow(3,2));//9.0
        System.out.println(Math.pow(2,3));//8.0
    }
}
