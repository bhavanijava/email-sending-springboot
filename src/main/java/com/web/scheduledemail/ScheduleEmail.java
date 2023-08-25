package com.web.scheduledemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.web.serviceimpl.EmailService;

@Component
public class ScheduleEmail {

	@Autowired
    private EmailService emailService;
	
	 @Scheduled(cron = "0 * * * * *") // This schedules the method to run every minute
	    public void sendScheduledEmail() {
	        emailService.sendEmail("sankarbhavani6304@gmail.com", "Scheduled Email From SpringBoot", "Welcome to Spring Boot Mail Application");
	        System.out.println("Scheduled email sent successfully!");
	    }
}
