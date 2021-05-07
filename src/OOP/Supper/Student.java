package Supper;

public class Student extends Person {
    public Student() {
        super("name");

        //调用父类构造器，必要要把调用语句放在第一句
        //隐藏代码：super();调用父类无参构造函数
        System.out.println("Student无参构造函数");
    }



    private String  name = "lisi";



    public void print(){


        super.test();//this.test();


        System.out.println(this.name);//lisi
        System.out.println(super.id);//2021110

        System.out.println(super.name);//zhangsan

    }

}
