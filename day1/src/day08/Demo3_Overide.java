package day08;

/**
 * 子父类，重写
 */
public class Demo3_Overide {
    public static void main(String[] args) {

    }
}

class Person{
    public void print(){
        System.out.println("Peson");
    }
}

class Student extends Person{
    public void print(){
        System.out.println("Student");
    }
}

class Father{
    public Person method(){
        return new Person();
    }
}

class Son extends Father{
    public Student method(){
        return new Student();//不能够是非子父类 new Demo（）
    }
}
class Demo{

}

