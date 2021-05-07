package OOP.Object;

public class Preson {
    String name;

    int age;

    public Preson(int age) {
        this.age = age;
    }

    //实例化初始值
    //使用new关键字，本质是在调用构造器
    //用来初始化值
    public Preson(){
      this.name = "zhangsan";
      this.age = 20;
    }
    //有参数构造,一旦定义了有参构造，无参构造就必须显示定义
    public Preson(String name){
        this.name = name;

    }


}
