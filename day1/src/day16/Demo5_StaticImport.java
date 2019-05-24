package day16;



import java.util.Arrays;

import static java.util.Arrays.sort;    //静态导入，
import static java.util.Arrays.toString;    //静态导入，

/**
 * 静态导入
 * 集合框架(静态导入的概述和使用)(了解)
 *    * A:静态导入概述
 *    * B:格式：
 *    	* import static 包名….类名.方法名;
 *    	* 可以直接导入到方法的级别
 *    * C:注意事项
 *    	* 方法必须是静态的,如果有多个同名的静态方法，容易不知道使用谁?
 *    	这个时候要使用，必须加前缀。由此可见，意义不大，所以一般不用，但是要能看懂。
 *
 *    Array全是Static方法
 */
public class Demo5_StaticImport {
    public static void main(String[] args) {
        int[] arr = {55,22,33,44,11};
//        Arrays.sort()
        //静态导入后可以写成这样
        sort(arr);
        //不好举例
//        System.out.println(toString());

    }
}
