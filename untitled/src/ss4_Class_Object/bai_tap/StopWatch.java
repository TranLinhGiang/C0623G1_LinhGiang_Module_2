package ss4_Class_Object.bai_tap;

import java.time.LocalTime;
import java.util.Locale;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime(LocalTime startTime) {
        return startTime;
    }
    public LocalTime getEndTime(LocalTime endTime) {
        return endTime;
    }
    StopWatch() {
        startTime = LocalTime.now();
        getStartTime(startTime);
    }
    public void start() {
        this.startTime = LocalTime.now();
        getStartTime(startTime);
    }
    public void stop() {
        this.endTime = LocalTime.now();
        getEndTime(endTime);
    }
    public void getElapsedTime() {
        int ElapsedTime = (endTime.toSecondOfDay() - startTime.toSecondOfDay()) * 100;
        System.out.println("number of milliseconds:" + ElapsedTime);
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int sum = 0;
        for (int i = 1; i < 1000000000; i++) {
           sum+=i;
        }
        stopWatch.stop();
        stopWatch.getElapsedTime();
    }
}


