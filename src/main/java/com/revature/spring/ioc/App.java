package com.revature.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // load the spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container
        MessageService myMsg = context.getBean("messageService", MessageService.class);
        // call methods on the bean
        myMsg.printMessage();
    }
}
