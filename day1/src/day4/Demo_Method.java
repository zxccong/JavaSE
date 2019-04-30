package day4;

/**
 *
 */
public class Demo_Method {

    public static void main(String[] args) {
        //修饰符 返回值类型 方法名（参数类型 参数名1，参数类型 参数名2）{
        //            方法的语句
        //            return 返回值
        //        }
        /*
        修饰符：目前就用public static
        返回值类型：就是功能结果的数据类型
        方法名：符合命名规则，方便调用就可
        参数：
            实际参数：实际参加运算的
            形式参数：就是方法定义的，用来接收实际参数的（传递过来）
        参数类型：就是参数的数据类型
        参数名：就是变量名
        方法体语句：完成功能的代码
        return 结束方法
        返回值：就是功能结果

         */
        //写个个方法
        int a=1;
        int b=1;
        int sum = a + b;

        /*
        求连个整数的和
        1.整数的和结果应该是整数
        2.有两个未知的内容参数运算

        怎么写方法
        1.明确返回值类型
        2.明确参数列表
         */
        Demo_Method.getSum(a,b);//1.调用add方法
                                //5.将方法结果返回给sum





    }
    public static int getSum(int a,int b){  //2.赋值a=10,b=10
                                                //3.执行语句把a和b相赋值给sum
        return a +b;                            //4.通过return将sum结果返回出去
    }


}
