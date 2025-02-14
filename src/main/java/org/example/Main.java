package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Driver leclerc = context.getBean("leclerc", Driver.class);

        System.out.println(leclerc.getName() + " races for " + leclerc.getTeam().getName());


    }
}
