package Extends;
//Student：子类、派生类
//子类继承了父类就会拥有父类全部方法
public class Student extends Person{

    public static void main(String[] args) {
        Student student= new Student();
        student.say();
        System.out.println(student.money);
    }
}
