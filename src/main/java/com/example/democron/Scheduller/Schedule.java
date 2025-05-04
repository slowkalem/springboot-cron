package com.example.democron.Scheduller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

    // https://crontab.cronhub.io/ for cron expression generator
    @Scheduled(cron = "*/5 * * * * *") // Every 5 seconds
    public void ExecuteTask() {
        // call service here
        System.out.println("Executing Task Every 5 Seconds");
    }
}