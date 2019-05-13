import java.io.*;

/**
 * 批量读取文件夹到统一文件
 */
public class BaseClass {

    public static void main(String[] args) {
        File[] files = new File("C:\\Users\\Administrator\\Desktop\\搬砖sql").listFiles();

        for (File fi : files) {
            BufferedReader bufferedReader=null;
            BufferedWriter bufferedWriter=null;
            try {
                 bufferedReader = new BufferedReader(new FileReader(fi));
                String file= "D:\\test.sql";
                bufferedWriter= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,true)));
                String s=null;
                while( (s= bufferedReader.readLine())!=null){
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
                }


            } catch (Exception e) {
                try {
                    bufferedReader.close();
                    bufferedWriter.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                e.printStackTrace();
            }
        }

    }
}
