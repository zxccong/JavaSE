package day14;

import java.util.Calendar;

/**
 * Calendar学习
 */
public class Demo9_Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        /*
        父类引用指向子类对象
        getInstance()->createCalendar(TimeZone.getDefault(), Locale.getDefault(Locale.Category.FORMAT));
        new GregorianCalendar(zone, aLocale);
         */
        System.out.println(c);
        /*
        java.util.GregorianCalendar[time=1557924432021,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2019,MONTH=4,WEEK_OF_YEAR=20,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=135,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=47,SECOND=12,MILLISECOND=21,ZONE_OFFSET=28800000,DST_OFFSET=0]
         东西有点多我们用public int get(int field)方法去来看
         */

        c.get(Calendar.YEAR);//获得年
        c.get(Calendar.DAY_OF_WEEK);//周日第一天，周六最后一天
        //可以写个表，进行查表，进行根据索引查数组对应位置

        //可以判断是否小于9小于九在前面加0
        /*
         * public void add(int field,int amount)
         * public final void set(int year,int month,int date)
         *
         */
        //加减
        c.add(Calendar.DAY_OF_WEEK,-1);
        //设置指定字段
        c.set(Calendar.YEAR,2011);
        c.set(2011,7,8);


    }
}
