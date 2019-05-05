package day09;

/**
 * 多态面试题
 */
public class Test_Polymorphic {
    public static void main(String[] args) {
        A a = new B();
        a.show(); //---->ai

        B b = new C();
        b.show(); //---->你


    }
}

class A{
    public void show(){
        show2();
    }

    public void show2() {

        System.out.println("我");
    }
}
class B extends A{
    public void show2(){
        System.out.println("ai");
    }
}

class  C extends B{
    public void show(){
        super.show();
    }
    public  void show2(){
        System.out.println("你");
    }
}
