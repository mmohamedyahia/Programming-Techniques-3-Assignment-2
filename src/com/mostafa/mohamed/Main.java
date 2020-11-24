package com.mostafa.mohamed;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        StopWatch sw = new StopWatch();

        sw.start();
        TimeUnit.SECONDS.sleep(5);
        sw.stop();

        System.out.println("StopWatch In Millisecond : " + sw.getElapsedTime() + " ms");
        System.out.println("StopWatch In Second : " + sw.getElapsedTime() / 1000 + " s");
        System.out.println("StartTime : " + sw.getStartTime());
        System.out.println("EndTime : " + sw.getEndTime());

        System.exit(0);
    }
}
