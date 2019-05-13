package day14;

import java.util.Date;

/**
 * Date
 */
public class Demo7_Date {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);             //当前时间
        System.out.println(new Date(0));    //东八区1970  1 1 08：00

        System.out.println(d1.getTime());   //通过时间对象获得毫秒值
        System.out.println(System.currentTimeMillis()); //通过系统获得毫秒值

        d1.setTime(1000);       //设置毫秒值，改变时间对象
    }
}
