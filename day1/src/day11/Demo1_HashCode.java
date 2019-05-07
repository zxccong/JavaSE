package day11;

/**
 * Object 的hashcode
 */
public class Demo1_HashCode {
    public static void main(String[] args) {
        Object o = new Object();
        int i = o.hashCode();
        System.out.println(i);
    }
}
