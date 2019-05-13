package day14;

import java.math.BigInteger;

/**
 * BigInteger
 */
public class Demo5_BigInteger {
    public static void main(String[] args) {

        /*
         * A:BigInteger的概述
         * 可以让超过Integer范围内的数据进行运算
         * B:构造方法
         * public BigInteger(String val)
         * C:成员方法
         * public BigInteger add(BigInteger val)(加)
         * public BigInteger subtract(BigInteger val)（减）
         * public BigInteger multiply(BigInteger val)（乘）
         * public BigInteger divide(BigInteger val)（除）
         * public BigInteger[] divideAndRemainder(BigInteger val)
         */

        BigInteger b1 = new BigInteger("100");
        BigInteger b2 = new BigInteger("2");
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println("b1.multiply(b2) = " + b1.multiply(b2));
        System.out.println(b1.divide(b2));

        BigInteger[] br2 = b1.divideAndRemainder(b2);
        for (int i = 0; i < br2.length; i++) {
            System.out.println(br2[i]);
        }

    }
}
