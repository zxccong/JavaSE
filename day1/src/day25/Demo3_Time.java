package day25;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Time
 */
public class Demo3_Time {
    public static void main(String[] args) {
        Timer t = new Timer();
        t.schedule(new MyTimerTask(), new Date(119,9,15,10,54,20),3000);

        while(true) {
            System.out.println(new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("起床背英语单词");
    }

}
