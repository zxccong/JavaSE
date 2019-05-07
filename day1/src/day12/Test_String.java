package day12;

/**
 * String 面试题
 */
public class Test_String {
    public static void main(String[] args) {
        /*
         * 1.判断定义为String类型的s1和s2是否相等
         * String s1 = "abc";
         * String s2 = "abc";
         * System.out.println(s1 == s2);
         * System.out.println(s1.equals(s2));
         * 2.下面这句话在内存中创建了几个对象?
         * String s1 = new String("abc");
         * 3.判断定义为String类型的s1和s2是否相等
         * String s1 = new String("abc");
         * String s2 = "abc";
         * System.out.println(s1 == s2);
         * System.out.println(s1.equals(s2));
         * 4.判断定义为String类型的s1和s2是否相等
         * String s1 = "a" + "b" + "c";
         * String s2 = "abc";
         * System.out.println(s1 == s2);
         * System.out.println(s1.equals(s2));
         * 5.判断定义为String类型的s1和s2是否相等
         * String s1 = "ab";
         * String s2 = "abc";
         * String s3 = s1 + "c";
         * System.out.println(s3 == s2);
         * System.out.println(s3.equals(s2));
         */
         String s1 = "abc";
         String s2 = "abc";
         System.out.println(s1 == s2);
         System.out.println(s1.equals(s2));


    }
}
