package com.revature;

public class EmailService implements MessageService {
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.println("Email sent: " + message);
    }
}
