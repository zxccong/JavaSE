package day03;

/**
 * 选择结构switch
 */
public class Demo10_switch {
    public static void main(String[] args) {

        /*int x =10;
        switch (x){     //可以接收byte ,short,char,int
                        //引用数据类型可以接收枚举（JDK1.5）String字符串（JDK1.7）
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }*/

        //面试题
        //byte可以
        //long 不可以
        //String 1.7之后可以

        //给定值，输出今天星期几
//        week
        /*
        * case 1:
        * break;
        *
        * */

        /**
         * 注意事项：
         *      case:后面只能是常量，不能是变量，而且后面的case 值不能出现相同的
         *      default可以省略
         *      break;最后一个可以省略
         *      会出现穿透问题
         *      default可以放在任意位置，但最后才执行
         *      结束条件：
         *          break ;
         *          大括号
         *
         *
         */


        //运行程序看结果
        /*int x= 2;
        int y =3;
        switch (x){     //可以接收byte ,short,char,int
            //引用数据类型可以接收枚举（JDK1.5）String字符串（JDK1.7）
            default:
                y++;
                break;
            case 3:
                y++;
            case 4:
                y++;
        }
        System.out.println(y);//->4*/

        int x= 2;
        int y =3;
        switch (x){     //可以接收byte ,short,char,int
            //引用数据类型可以接收枚举（JDK1.5）String字符串（JDK1.7）
            default:
                y++;
            case 3:
                y++;
            case 4:
                y++;
        }
        System.out.println(y);//->6

    }
}
