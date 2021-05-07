package Day1;/*
- 数值类型：整数类型
byte占1个字节范围：-128-127
short占2个字节范围：-32768-32767
int占4个字节范围：
long占8个字节范围：数字后面需加L来区分

- 数值类型：浮点类型
float占4个字节范围：数字后面需加F来区分
double占8个字节范围：

- 数值类型：字符类型
char占2个字节范围：就只能是一个
String是字符串类型，不是关键字，是类

- boolean类型：
占1位，其值只有true和false
 */

import java.math.BigDecimal;

public class Day1 {
    public static void main(String[] args) {
        String day1="java变量学习"; //字符串变量
        int a=10;
        System.out.println(day1);
        System.out.println("======================================================");
        //八大基本数据类型
        //整数

        int num1 = 10;
        byte num2 = 20;
        short num3 = 30;
        long num4 = 30L;//long类型要在数字后面加L
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        //小数
        float num5 = 50.1F;//float类型要在数字后面加F
        double num6 = 3.14159;
        System.out.println(num5);
        System.out.println(num6);
        //字符
        char name= 'A';
        System.out.println(name);

        //字符串
        String namea = "张三";
        System.out.println(namea);
        //布尔值
        boolean flag = true;
        boolean flag1 = false;
        System.out.println(flag);
        System.out.println(flag1);
        System.out.println("======================================================");
        //整数拓展：进制 ，二进制开头0b 八进制开头0 十六进制开头0x
        int i = 0b10;
        int c = 010;
        int b = 0x10;

        System.out.println(i);
        System.out.println(c);
        System.out.println(b);
        System.out.println("======================================================");
        //浮点数拓展:有限，离散，有误差，接近但不等于
        float f =0.1f;
        double d = 1.0/10;

        System.out.println(f==d);//false
        System.out.println(f);//0.1
        System.out.println(d);//0.1

        float d1 = 102546827f;
        float d2 = d1+1;
        System.out.println(d1==d2);//ture


        //BigDecimal类（银行业务）

        System.out.println("======================================================");
        //字符拓展
        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1);
        System.out.println((int)c1);//强制转换

        System.out.println(c2);
        System.out.println((int)c2);//强制转换

        //所有字符本质都是数字
        System.out.println("======================================================");
        //转义字符  \t制表符；\n换行...

        System.out.println("hello\tworld");
        System.out.println("hello\nworld");

        System.out.println("======================================================");
        //变量转换
        int i1 = 128;
        byte i2 = (byte) i1;//由高到低 强制转换
        double i3 = i1;//由低到高

        System.out.println(i1);//128
        System.out.println(i2);//-128 内存溢出
        System.out.println(i3);//128.0
        System.out.println("======================================================");


        //操作比较大的时候注意溢出问题
        //jdk新特性，数字之间可以用下划线分割
        int money = 1000000000;
        int years = 20;
        int total = money*years;//-1474836480,计算结果溢出
        long total2 = money*years;//默认是int类型，转换之前已经存在问题
        long total3 = money*((long)years);//先把一个数转换为Long

        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);

        System.out.println("======================================================");


    }
}
