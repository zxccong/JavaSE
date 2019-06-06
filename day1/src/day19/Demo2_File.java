package day19;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File学习
 */
public class Demo2_File {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("");
            //构造1
            File file = new File("D:\\zxc\\netx-accountant");
            File file1 = new File("xxx.txt");

            file.exists();

            //构造2
            File file2 = new File("D:\\zxc\\netx-accountant","xxx.txt");


            //构造3
            File file3= new File(file,"xxx.txt");

            try {
                //存在就不创建文件，
                file3.createNewFile();
                //创建文件夹
                file3.mkdir();
                //创建多级文件夹
                file3.mkdirs();

                //重命名,并可以移动位置
                file3.renameTo(file2);
                //删除不走回收站
                file3.delete();
                //删除文件夹(如果删除一个文件夹，文件夹目录下必须是空的)
                file1.delete();

                //是否文件夹
                file1.isDirectory();
                //是否是文件
                file.isFile();
                //是否存在
                file.exists();
                //设置是否可读
                file.setReadable(false);        //window认为系统所有文件都是可读的
                //设置是否可写
                file.setWritable(false);
                //查看是否可读是否可写
                file.canRead();
                file.canWrite();
                //是否隐藏
                file.isHidden();

                //获得绝对路径
                file.getAbsolutePath();
                //获得路径
                file.getPath();//获取构造方法传入的路径
                //获得名称
                file.getName();//获取文件或者文件夹的名称
                //获得文件字节
                file.length();
                //获取最后的修改时间
                long l = file.lastModified();
                Date date = new Date(l);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm ss");
                sdf.format(l);
                //获得指定目录下的所有文件或文件夹名称的数组
                String[] list = file.list();
                //获得指定目录下的所有文件或文件夹的File对象数组
                File[] files = file.listFiles();
                //File重写toString()
                //如果没有重写的话，是Object 的toString方法 类名@Hash16进制表达形式

                for (String string : list) {
                    if (string.endsWith(".jpg")){
                        System.out.println(string);
                    }
                }

                for (File fil:files){
                    if (fil.isFile()&&fil.getName().endsWith(".jpg")){
                        System.out.println(fil);
                    }
                }

                file.list(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        File file5 = new File(dir,name);
                        return file5.isFile()&&file5.getName().endsWith(".jpg");
                    }
                });


            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
