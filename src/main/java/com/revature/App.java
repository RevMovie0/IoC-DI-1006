package com.revature;

public class App {
    public static void main(String[] args) {
        MessageClient client = new MessageClient();

        // Inject EmailService
        client.setMessageService(new EmailService());
        client.processMessage("This is an Email message.");

        // Inject SMSService
        client.setMessageService(new SMSService());
        client.processMessage("This is an SMS message.");
    }
}
