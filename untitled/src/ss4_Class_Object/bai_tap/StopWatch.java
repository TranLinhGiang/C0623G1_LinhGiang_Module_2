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
        int ElapsedTime = (startTime.toSecondOfDay() - endTime.toSecondOfDay()) * 100;
        System.out.println("số mili giây:" + ElapsedTime);
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 1; i < 100000; i++) {
            stopWatch.stop();
            stopWatch.getElapsedTime();
        }
    }
}


