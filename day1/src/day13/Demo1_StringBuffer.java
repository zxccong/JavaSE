package day13;

/**
 * StringBuffer
 */
public class Demo1_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.length();    //实际容量
        sb.capacity();//理论容量

        StringBuffer sb2 = new StringBuffer(10);
        sb2.capacity();     //-》10

        StringBuffer sb3 = new StringBuffer("heima");
        sb.length();
        sb.capacity(); //->字符串+初始容量

        /*StringBuffer s1 = sb.append(true);
        StringBuffer s2 = sb.append("heima");
        StringBuffer s3 = sb.append(100);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);*/

        //返回的时对堆内存中
        //s1,s2,s3,都是指向同一个对象

        //sb.insert(3,"123"); //->对空的字符序列插入，会出现数组越界异常


        String s="heima";
        System.out.println("s = " + s);
        change(s);
        System.out.println("s = " + s); //->结果不变

        System.out.println("sb = " + sb);
        change2(sb);
        System.out.println("sb = " + sb);//->结果改变




    }

    private static void change2(StringBuffer sb) {
        sb.append("123");
    }

    private static void change(String s) {
        s+="abc";
    }
}
