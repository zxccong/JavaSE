package day16;

import java.util.ArrayList;
import java.util.List;

/*
泛型学习
 */
public class Demo3_Generic {
    public static void main(String[] args) {
        Generic_Tool<String> stringGeneric_tool = new Generic_Tool<>();
        stringGeneric_tool.setT("123");
        stringGeneric_tool.getT();
        stringGeneric_tool.show("456");
        stringGeneric_tool.show(true);//改后传什么类型就是什么类型


        /*
        集合框架(泛型高级之通配符)(了解)
   * A:泛型通配符<?>
   	* 任意类型，如果没有明确，那么就是Object以及任意的Java类了
   * B:? extends E
   	* 向下限定，E及其子类
   * C:? super E
   	* 向上限定，E及其父类
         */

//        List<Object> list = new ArrayList<String>(); //报错前后不一致
        List<?> list = new ArrayList<String>();         //不报错 当右边的泛型不确定时，左边可以写为？
        //Collection addAll(? extent E)
    }
}
//接口泛型
interface Inter<T>{
    void show(T t);
}

/*class Demo implements Inter<String>{      //第一种方法实现接口泛型
                                            //推荐
    @Override
    public void show(String s) {

    }
}*/

class Demo<T> implements Inter<T>{      //第二种，可以但是没有必要，在定义类的时候又定义一次泛型

    @Override
    public void show(T t) {

    }
}

