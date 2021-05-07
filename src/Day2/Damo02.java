package Day2;

public class Damo02 {
    public static void main(String[] args) {
        //逻辑运算符  与and&&   或or||  非not!
        boolean a= true;
        boolean b= false;


        System.out.println(a&&b);//false
        System.out.println(a||b);//ture
        System.out.println(!(a||b));//false

        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<10);
        System.out.println(d);
        System.out.println(c);


        //位运算
        /*
        A = 0011 1100
        B = 0000 1101
        A&B = 0000 1100
        A|B = 0011 1101
        A^B = 0011 0001  异或
        ~B = 1111 0010  取反

        <<左移 *
         >>右移 /
         */




    }
}
