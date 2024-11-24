package com.example.Springboot_Scheduling_with_CronJob;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Component
public class Scheduling {
    @GetMapping("/test")
    public String test()
    {
        return "Hello! this is for the CRON Job test";
    }
    @Scheduled(fixedDelay = 1000)
    public void testing()
    {
        System.out.println("action logged "+ LocalDateTime.now());
    }
    @Scheduled(cron = "*/15 * * * * *")
    public void testing1()
    {
        System.out.println("Hello Everyone!"+ LocalDateTime.now());
    }
    @Scheduled(cron = "0 */2 * * * *") // At the start of every 2nd minute
    public void runEvery2Minutes() {
        System.out.println("Task executed every 2 minutes at " + LocalDateTime.now());
    }
    @Scheduled(cron = "0 5 * * * *") // At the 5th minute of every hour
    public void runEveryHourAt5thMinute() {
        System.out.println("Task executed at 5th minute of every hour: " + LocalDateTime.now());
    }
    @Scheduled(cron = "0 0 15 1,15 * *") // At 3:00 PM on the 1st and 15th of each month
    public void runOn1stAnd15thOfMonth() {
        System.out.println("Task executed on 1st and 15th of the month at " + LocalDateTime.now());
    }
    @Scheduled(cron = "0 0 8 1 1,5,9 *") // At 8:00 AM on Jan, May, and Sep 1st
    public void runOnSpecificMonths() {
        System.out.println("Task executed on Jan, May, and Sep 1st at 8:00 AM: " + LocalDateTime.now());
    }
    @Scheduled(cron = "0 0 10 * * MON,FRI") // At 10:00 AM on Monday and Friday
    public void runEveryMondayAndFriday() {
        System.out.println("Task executed every Monday and Friday at 10:00 AM: " + LocalDateTime.now());
    }

    @Scheduled(cron="$(job.cron.priyanka)")
    public void parametrizedcron()
    {
        System.out.println("Hello Developers");
    }
}
