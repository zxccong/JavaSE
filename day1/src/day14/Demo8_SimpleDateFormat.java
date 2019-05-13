package day14;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat类学习
 */
public class Demo8_SimpleDateFormat {
    public static void main(String[] args) {
//        DateFormat dateFormat = new DateFormat(); //DataForat是抽象类不允许实例化

        //相当于return new SimpleDateFormat("");
        //return new SimpleDateFormat(timeStyle, dateStyle, loc);
        //DateFormmat df = new SimpleDateFormat();
        DateFormat df = DateFormat.getDateInstance();

        /*
         * B:SimpleDateFormat构造方法
         * public SimpleDateFormat()
         * public SimpleDateFormat(String pattern)
         * C:成员方法
         * public final String format(Date date)
         * public Date parse(String source)
         */

        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println(simpleDateFormat.format(new Date()));    //19-5-10 上午8:13*/
        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd:HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));                //2019:05:10:08:16:57*/

        //将时间字符串转换成日期对象
        String str = "2000年08月";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月");
        try {
            System.out.println(dateFormat.parse(str));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
