package day25;

import java.io.IOException;

/**
 *  实现了单例模式的类Runtime
 */
public class Demo2_Runtime {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process exec = runtime.exec("shutdown -s -t 300");
        runtime.exec("shutdown -a");
        //因为添加和取消都是同一个对象进行修改
    }
}
