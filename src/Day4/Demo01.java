package Day4;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩");
        String s = scanner.nextLine();

        //equals:判断字符串是否等于
        if (s.equals("Hello")){
            System.out.println(s);
        }
        System.out.println("End");


        int score = scanner.nextInt();
        if(score==100){
            System.out.println("恭喜满分");
        }else if (score==90){
            System.out.println("a级");
        }else if (score<60){
            System.out.println("不及格");
        }
        scanner.close();
    }
}
