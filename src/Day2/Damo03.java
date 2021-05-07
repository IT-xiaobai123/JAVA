package Day2;

/**
 * @author dcc
 * @version 1.0
 * @serial 1.8
 */
public class Damo03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a+=b;//a=a+b

        System.out.println(a);

        a-=b;//a=a-b

        System.out.println(a);

        //字符串连接符  +  ，  string
        //字符串在左就进行连接操作，字符串在右就进行正常操作
        System.out.println(""+a+b);//1020
        System.out.println(a+b+"");//30

        //三元运算符   x ? y : z  如果x==true ，则结果为y，否则结果为z
         int score = 80;
         String type = score < 60 ?"不及格": "及格";
        System.out.println(type);

    }
   }

