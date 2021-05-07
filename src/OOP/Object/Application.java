package OOP.Object;

public class Application {
    public static void main(String[] args) {
//       new实例化一个对象
        Student student = new Student();
        student.name = "xiaoming";
        student.age = 20;
        Student.play();//对比，非静态
        student.study();//对比，静态
        System.out.println(student.name);
        System.out.println(student.age);


        Preson preson = new Preson();
        System.out.println(preson.name);
        System.out.println(preson.age);




        Pet dog = new Pet();
        dog.name = "小红";
        dog.age = 5;
        dog.shut();
        System.out.println(dog.name);
        System.out.println(dog.age);





    }

}
