package com.revature.spring.ioc;

public class SMSService implements MessageService {
    @Override
    public String getMessage() {
        return "This is an SMS message.";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}
