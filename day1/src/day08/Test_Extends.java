package day08;

/**
 * 继承面试题
 */
public class Test_Extends {
    

    public static void main(String[] args) {
        Son son = new Son();
        son.show();
        

    }


}
 class Father{
     public int num = 10;
    public Father(){
        System.out.println("fu");
    }
}

 class  Son extends Father {
     public int num = 20;
    public Son(){
        System.out.println("zi");
    }

     public void show() {
        int num =30;
         System.out.println("num = " + num);
         System.out.println("this.num = " + this.num);
         System.out.println("super.num = " + super.num);
     }
 }

 /*
 输出
    fu
    zi
    30
    29
    10
  */