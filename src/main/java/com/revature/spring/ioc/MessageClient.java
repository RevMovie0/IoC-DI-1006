package com.revature.spring.ioc;

public class MessageClient {
    private MessageService messageService;

    // Setter-based Dependency Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage() {
        if (messageService != null) {
            String msg = messageService.getMessage();
            messageService.sendMessage(msg);
        } else {
            System.out.println("No MessageService injected.");
        }
    }
}
