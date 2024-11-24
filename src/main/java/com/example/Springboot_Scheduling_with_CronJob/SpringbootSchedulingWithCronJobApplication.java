package com.example.Springboot_Scheduling_with_CronJob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootSchedulingWithCronJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSchedulingWithCronJobApplication.class, args);
	}

}
