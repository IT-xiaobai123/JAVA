package Day1;

public class type {

    //常量

   static final double PI = 3.14;
    //类变量
    static  double salary = 2500;
    //static 修饰符不存在前后

    //实例变量：从属于对象,如果不自行初始化，这个类型的默认值一般为 0 0.0 null。布尔值默认是false。
    //除了基本类型其余默认值都是null
    String name;
    int age;

    //main方法
    public static void main(String[] args) {
        //局部变量：必须声明和初始化值
        int i = 10;

        //变量类型  变量名字 = new 变量类型
        type demo1 = new type();//实例变量

        System.out.println(demo1.age);
        System.out.println(demo1.name);


        System.out.println(salary);
        System.out.println(PI);
    }
    //add方法
    public void add(){
        //
    }
}
