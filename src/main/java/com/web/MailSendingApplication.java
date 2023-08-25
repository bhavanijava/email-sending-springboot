package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.web.serviceimpl.EmailService;

@SpringBootApplication
@EnableScheduling
public class MailSendingApplication {

	@Autowired
	private EmailService emailService;
	
	public static void main(String[] args) {
		SpringApplication.run(MailSendingApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMai() {
		emailService.sendEmail("sankarbhavani6304@gmail.com", "Normal mail From Spring Boot Email", "Welcome to Spring Boot Mail Application");
		System.out.println("Normal mail sended successfully");
	}
}
