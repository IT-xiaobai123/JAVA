package Supper;

public class Person {

    public Person( String name) {
        System.out.println("Person无参构造函数");


    }



    public void test(){
        System.out.println("test");

    }

    public String name = "zhangsan";
    private int age = 20;//私有无法被继承
    protected String id = "20211101";
}
