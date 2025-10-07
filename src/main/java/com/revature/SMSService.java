package com.revature;

public class SMSService implements MessageService {
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.println("SMS sent: " + message);
    }
}
