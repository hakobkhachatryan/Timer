package com.company.service;

import com.company.model.Timer;

public class TimerService {
    public void startTimer(int min,int sec){
        Timer timer = new Timer();
        timer.timer(min,sec);
    }
}
