package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileInputStream
 */
public class Demo1_FileInputStream {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        FileOutputStream fos=null;
        try {
            //字节输入流
             fileInputStream = new FileInputStream("xxx.txt");
             //覆盖
            fos= new FileOutputStream("bbb.txt");   //如果没有就会自动创建一个文件
            fos.write(97);      //a     //自动去除前3个8位
            fos.write('a');     //a
            //追加
            fos= new FileOutputStream("bbb.txt",true);


            fileInputStream.read();//a->97  //最后一个是-1
            //常用写法
            //遍历整个文件
            int b=0;            //之所以返回int防止-1导致读取未结束，错误结束
            while((b= fileInputStream.read())!=-1){
                System.out.println(b);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileInputStream!=null){
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
