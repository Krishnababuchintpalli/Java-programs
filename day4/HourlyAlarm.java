package day4;

import java.util.Timer;
import java.util.TimerTask;

public class HourlyAlarm {
    public static void main(String[] args) {
        Timer timer = new Timer();


        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("1hr done");
            }
        }, 0, 1000 * 60 * 60); 

        System.out.println("Alarm started! It will print '1hr done' every hour.");
    }
}
