package Day5method;
/**
 * @author 86183
 */ //命令行传参
public class Demo02 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length ; i++) {
            System.out.println("args"+i+args[i]);
        }
    }
}
