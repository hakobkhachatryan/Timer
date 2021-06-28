package com.company.model;

public class Timer {
    public void timer(int min,int sec){
        int second = min * 60 + sec;
        int x = second;

        for (int i = 0; i < x; i++) {
            int minutes = second / 60;
            int seconds = second % 60;
            second--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(minutes + ":" + seconds);
        }
    }
}
