package day27;

/**
 * 反射
 */
public class Demo1_Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取字节码对象1
        Class clazz = Class.forName("day27.Peason");
        //获取字节码对象2
        Class clazz2= Peason.class;
//        Peason peason = new Peason();
        //获取字节码对象3
//        Class clazz3= peason.getClass();

    }
}
