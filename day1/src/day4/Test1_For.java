package day4;

/**
 * for练习
 */
public class Test1_For {
    public static void main(String[] args) {
        //    输出1-10
        for (int i = 0 ;i<10;i++) {
            System.out.println(i);
        }
        //    输出10-1
        for (int i = 10 ;i>0;i--) {
            System.out.println(i);
        }
        //    注意事项：
        //        单条语句可以不加括号
        //        for（）； {构造代码块}


        //    练习：求1-10的和
        int sum=0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        //        求1-100的偶数和
        for (int i = 0; i < 100; i++) {
            if (i%2==0) {
                sum += i;
            }
        }
        //        求1-100的奇数和
//        for (int i = 0; i < 100; i++) {
//            if (i%2!=0) {
//                sum += i;
//            }
//        }
        for (int i = 1; i < 100; i+=2) {
                    if (i%2!=0) {
                        sum += i;
                    }
        }

        //水仙花数
        //计数器思想
        int count =0 ;
        for(int i  =100 ;i<=999;i++){
            int ge =i %10;
            int si = i /10%10;
            int bai= i/10/10%10;
            if (ge*ge*ge+si*si*si+bai*bai*bai==i){
                System.out.println(i);
                count++; //满足条件就自增，计数器思想
            }


        }


    }

}
