package encapsulation;
/*
封装意义：
1.提高程序的安全性；
2.隐藏代码的实现细节；
3.统一接口（get、set）；
4.增加系统可维护性；

 */
public class Demo01 {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("zhangsan");

        System.out.println(student.getName());

        student.setId(2020);
        System.out.println(student.getId());
    }
}
