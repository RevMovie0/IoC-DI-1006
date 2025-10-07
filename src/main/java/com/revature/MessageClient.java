package com.revature;

public class MessageClient {
    private MessageService messageService;

    // Setter-based Dependency Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message) {
        if (messageService != null) {
            messageService.sendMessage(message);
        } else {
            System.out.println("No MessageService injected.");
        }
    }
}
