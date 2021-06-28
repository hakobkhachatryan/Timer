package com.company.test;

import com.company.service.TimerService;

public class TimerTest {
    public static void main(String[] args) {
        TimerService ts = new TimerService();
        ts.startTimer(5,47);
    }
}
