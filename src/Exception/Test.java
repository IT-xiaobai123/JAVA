package Exception;

import java.util.MissingResourceException;

public class Test {
    static void test(int a) throws MyException {
        if (a>10){
            throw new MyException(a);//抛出异常
        }
        System.out.println("ok");
    }

    public static void main(String[] args) {
        try {
            test(12);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
