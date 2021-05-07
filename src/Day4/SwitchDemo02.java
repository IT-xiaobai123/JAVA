package Day4;

public class SwitchDemo02 {
    public static void main(String[] args) {
        //case 穿透  //switch匹配一个具体的值
        char grade = 'D';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("继续努力");
                break;
            default:
                System.out.println("未知等级");
        }
        String name = "大神";

        switch (name){
            case "垃圾":
                System.out.println("垃圾");
                break;
            case "大神":
                System.out.println("大神");
                break;
            default:
        }
    }
}
