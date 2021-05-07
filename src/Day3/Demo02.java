package Day3;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextLine方式接收：");

        //判断用户有没有输入字符
        if (scanner.hasNextLine()){
            //使用nextline方式接收
            String str = scanner.nextLine();
            System.out.println("输出的内容为："+str);
        }
        //凡是属于IO流的类如果不关闭会一直占用资源，不使用就需要关闭。
        scanner.close();
    }
}
