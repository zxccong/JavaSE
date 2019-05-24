package day16;

public class Generic_Tool<T> {
    private  T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public<S> void show(S s){      //方法泛型需要与类的泛型一致
        System.out.println(s);      //如果不一致，需要在方法上声明该泛型
    }

/*    public static  void print(T t){ //与类的泛型一致反而出错了
                                        //静态方法是随着类的加载而加载的
    }*/                                 //静态方法必须声明自己的声明

    public static<T>  void print(T t){

    }
}
