package day14;


import java.math.BigDecimal;

/**
 * BigDecimal学习
 */
public class Demo6_BigDecimal {
    public static void main(String[] args) {

        System.out.println(2.0-1.1);//->0.89999999

        BigDecimal d1 = new BigDecimal(2.0);
        BigDecimal d2 = new BigDecimal(1.1);

/*
        System.out.println(d1.add(d2));         //3.100000000000000088817841970012523233890533447265625
        System.out.println(d1.subtract(d2));    //0.899999999999999911182158029987476766109466552734375
        System.out.println(d1.multiply(d2));    //2.200000000000000177635683940025046467781066894531250
        System.out.println(d1.divide(d2));      //java.lang.ArithmeticException
*/

        BigDecimal d3 = new BigDecimal("2.0");
        BigDecimal d4 = new BigDecimal("1.1");

        System.out.println(d3.add(d4));         //3.1
        System.out.println(d3.subtract(d4));    //0.9
        System.out.println(d3.multiply(d4));    //2.20
        System.out.println(d3.divide(d4,10,BigDecimal.ROUND_UP));      //java.lang.ArithmeticException
        /*
        static int

    ROUND_CEILING

    Rounding mode to round towards positive infinity.

    向正无穷方向舍入

    static int

    ROUND_DOWN

    Rounding mode to round towards zero.

    向零方向舍入

    static int

    ROUND_FLOOR

    Rounding mode to round towards negative infinity.

    向负无穷方向舍入

    static int

    ROUND_HALF_DOWN

    Rounding mode to round towards "nearest neighbor" unless both neighbors are equidistant,

    in which case round down.

    向（距离）最近的一边舍入，除非两边（的距离）是相等,如果是这样，向下舍入,例如1.55保留一位

    小数结果为1.5

    static int

    ROUND_HALF_EVEN

    Rounding mode to round towards the "nearest neighbor" unless both neighbors are equidistant,

    in which case, round towards the even neighbor.

    向（距离）最近的一边舍入，除非两边（的距离）是相等,如果是这样，如果保留位数是奇数，

    使用ROUND_HALF_UP，如果是偶数，使用ROUND_HALF_DOWN

    static int

    ROUND_HALF_UP

    Rounding mode to round towards "nearest neighbor" unless both neighbors are equidistant,

    in which case round up.

    向（距离）最近的一边舍入，除非两边（的距离）是相等,如果是这样，向上舍入, 1.55保留一位

    小数结果为1.6

    static int

    ROUND_UNNECESSARY

    Rounding mode to assert that the requested operation has an exact result, hence no

    rounding is necessary.

    计算结果是精确的，不需要舍入模式

    static int

    ROUND_UP

    Rounding mode to round away from zero.

    向远离0的方向舍入
         */
//        System.out.println(d3.divide(d4));      //java.lang.ArithmeticException

    BigDecimal bd1 = BigDecimal.valueOf(2.2);
    BigDecimal bd2 = BigDecimal.valueOf(1.1);

        System.out.println(bd1.add(bd2));
    }
}
