package DuoTai;

public class Demo {
    public static void main(String[] args) {
        //一个对象的实际类型是确定的
        //new Student
        //new Person
        //Student（子类）能调用的方法都是自己或者继承父类的
        //Person（父类）可以指向子类，但不能调用子类独有的方法
        Student s1= new Student();//子类的引用指向子类
        Person s2 = new Student();//父类的引用指向子类
        Object s3= new Student();

        s2.run();//子类重写了父类的方法，执行子类的方法
        s1.run();
        //对象能执行哪些方法，主要看对象左边的类型，和右边关系不大
        s1.eat();



    }


}
