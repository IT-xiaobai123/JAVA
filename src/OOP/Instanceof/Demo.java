package Instanceof;

public class Demo {
    public static void main(String[] args) {
        Object object = new Teacher();
        //Object>String
        //Object>Person>Teacher

        System.out.println(object instanceof Teacher);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof String);//false

        Person person = new Person();
        person.run();
        //person.eat();不能使用


        //类型之间的转换：父类——————子类

        Person person1 = new Student();//低转高
        person1.run();

        //将preson1这个对象转换为Student类型，就可以使用Student类型里的方法。
        Student student1 = (Student) person1;//强制转换高转低：Person转换为Student类型
        student1.eat();//((Student) person1).eat();
        student1.run();

//******************************************8
        Student student = new Student();
        student.eat();
        student.run();
        //Student类转换成Person类
        //子类转父类可能丢失一些自己本来的方法
         Person person2 = student;
         //person2.eat();

        /*
        1.父类引用指向子类的对象
        2.把子类转换为父类，向上转型，低转高不用强制转换（好像没用）子类继承父类可以直接调用父类方法
        3.把父类转换为子类，向下转型，高转低，需要强制转换，((Sudent)person)方法名。
         */


    }
}
