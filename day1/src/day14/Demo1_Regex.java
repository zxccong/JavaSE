package day14;

/**
 * 正则表达式
 *
 */
public class Demo1_Regex {
    public static void main(String[] args) {
        String regx = "[1-9]\\d{4,14}";
        "f12d3sa".matches(regx);
    }

}
