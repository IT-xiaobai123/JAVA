package Override;
/*
静态的方法和非静态的方法区别很大：
静态方法：方法的调用只和左边，定义的数据类型有关
非静态：重写！！！

 */
public class Demo {
    public static void main(String[] args) {


        B b = new B();
        b.print();//B.print
        //重写
        b.test();//B.test

        A a = new B();
        a.print();//A.print
        //重写
        a.test();//B.test




    }



}
