package com.revature.spring.ioc;

public class EmailService implements MessageService {
    @Override
    public void printMessage() {
        System.out.println("This is an Email message.");
    }
}
