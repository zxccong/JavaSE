package day06;

/**
 * 学生类
 */
public class Demo1_Students {

    /*
    属性：姓名，年龄，性别
    行为：学习，睡觉
     */

    public static void main(String[] args) {
//        Student student= new Student();
//        Phone phone =new Phone();
//        //使用对象属性
//        student.name="张三";
//        //调用对象的方法
//        student.playGame();

        print(1);

        print(new Student());
    }
    public static void print(int s) {       //基本数据类型当作形式参数--》直接就赋值了
        System.out.println("s = " + s);
    }

    public static void print(Student student){ //引用数据类型当作形式参数
        student.name="张三";
//        //调用对象的方法
        student.playGame();
    }
}

