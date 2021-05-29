package com.mars.scheduled;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduled {

	@Scheduled(cron="0/2 * * * * ?")
	public void scheduledMethod() {
		System.out.println("MyScheduled..." + new Date());
	}
}
