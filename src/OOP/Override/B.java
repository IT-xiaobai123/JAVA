package Override;

public class B extends A {
    @Override//注解（重写）
    public void test(){
        System.out.println("B.test");
    }
    public static void print(){
        System.out.println("B.print");
    }
}
