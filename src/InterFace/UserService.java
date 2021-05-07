package InterFace;
//接口只能定义方法
//接口中所有定义的方法其实都是抽象的
public interface UserService {
    //接口中也可以定义常量
    int age = 20;
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);

}

