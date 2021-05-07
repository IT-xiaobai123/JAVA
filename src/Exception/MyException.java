package Exception;

public class MyException extends Exception{
    public int detil;

    public MyException(int a) {
        this.detil = a;
    }

    @Override//打印异常
    public String toString() {
        return "MyException{" +
                "detil=" + detil +
                '}';
    }
}
