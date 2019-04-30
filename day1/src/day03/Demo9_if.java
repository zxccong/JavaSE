package day03;

import java.util.Scanner;

/**
 * 选择结果if
 */
public class Demo9_if {
    public static void main(String[] args) {

        //选择结构if switch
        /*
        注意事项
            1表达式要是boolean类型，
            2.一句话大括号可以省略 int i = 10;是两句话
            3.if ();  {  构造代码块}

        结构1
        if (表达式){
            语句体；
        }
        结构2
        if(){
        }
        else{
        }
        结构3
        if(){

        }else if（）{

        }else{

        }
        */
        //if练习题
        int x = 10;
        int y = 20;
        int z ;
        if (x>y){
            z= x;
        }else {
            z=y;
        }
        //练习二
        int num = 10;
        if (num % 2 ==0){
            System.out.println("偶数");
        }else {
            System.out.println("基数");
        }

        //练习3三目运算符可以切换if ……else
        //如果是输出语句的话，三目运算符不能代替
        //因为运算符，要有运算结果
        /*if(){

        }else if（）{

        }else{

        }
        else可以忽略
        */

        //练习判断成绩等级
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i>=90&&x<=100) {
            System.out.println("优");
        }else if (i>=80){
            System.out.println("良");
        }else if (i>=70){
            System.out.println("中");
        }else if (i>=60){
            System.out.println("及格");
        }else if (i>=0){
            System.out.println("差");
        }else {
            System.out.println("录入错误");
        }

        //练习
        /*
        * x>=3 y=2*x+1;
        * -1<x<3 y=2*x;
        * x<=-1 y=2*x-1;
        * 输出y的结果
        * */

        //嵌套使用
        /*
        * if(){
        *   if(){
        *
        *   }
        * }
        * */

    }
}
