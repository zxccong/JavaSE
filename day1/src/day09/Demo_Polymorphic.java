package day09;

/**
 * 多态测试
 */
public class Demo_Polymorphic {
    

    public static void main(String[] args) {

        Father f = new Son();
        System.out.println("f.num = " + f.num);
        f.print();
    }


}

class Father{
    public int num = 10;
    public void print(){
        System.out.println("fa");
    }

}

 class  Son extends Father {
     public int num = 20;
     public void print(){
         System.out.println("Son");
     }
 }

