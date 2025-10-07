package com.revature.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        MessageClient client = new MessageClient();

        // Inject EmailService
        client.setMessageService(new EmailService());
        client.processMessage();

        // Inject SMSService
        client.setMessageService(new SMSService());
        client.processMessage();
    }
}
