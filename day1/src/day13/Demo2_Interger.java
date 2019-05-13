package day13;

/**
 * 包装类Integer
 */
public class Demo2_Interger {
    public static void main(String[] args) {
        Integer.toBinaryString(10);//转换二进制并转换为String

        int  i= 100;
        String s1= i +"";

        String s2 = String.valueOf(i);
        Integer i2 = new Integer(i);

        String s3 = i2.toString();

        String s4 =  Integer.toString(i);


        String s5= "100";
        Integer.parseInt(s5);

        new Integer(s5).intValue();


        int x = 100;

        Integer i1= new Integer(x); //手动装箱

        int y = i1.intValue();      //将对象转换为基本类型，拆箱

        Integer o2 = 100;           //自动装箱

        int z = o2 + 200;           //自动拆箱

//        Integer.valueOf()

    }
}
