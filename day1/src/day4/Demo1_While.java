package day4;

/**
 * while循环的格式
 */
public class Demo1_While {
    public static void main(String[] args) {
        //while(判断条件语句){
        //循环体语句
        //控制条件语句
        // }
        int x= 1;
        while (x<=10){
            System.out.println(x);
            x++;
        }

        //求1-100的和
        int sum =0;
        int i=1;
        while (i<=100){
            sum +=i;
            i++;
        }

        //水仙花数
        int count =0 ;
        i=100;
        while (i<=999){
            int ge =i %10;
            int si = i /10%10;
            int bai= i/10/10%10;
            if (ge*ge*ge+si*si*si+bai*bai*bai==i){
                System.out.println(i);
                count++; //满足条件就自增，计数器思想
            }

        //do ...while()
            /**
             * 格式
             * do {
             * 循环体语句
             * 控制条件语句
             * }while(条件语句);
              */
        do{
            i++;
        }while (i<10);




        }
    }
}
