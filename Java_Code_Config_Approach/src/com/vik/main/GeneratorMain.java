package com.vik.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.vik.bean.DateGenrator;
import com.vik.config.AppConfig; // Import AppConfig properly

public class GeneratorMain {

    public static void main(String[] args) {
        System.out.println("Main Method started");
        
        // Pass the class name (not string)
        AnnotationConfigApplicationContext ctx = 
                new AnnotationConfigApplicationContext(AppConfig.class);
        
        System.out.println("Container created");
        
        DateGenrator dateGenrator = (DateGenrator) ctx.getBean("dateGenrator");
        dateGenrator.printDate();
        
        ctx.close();
    }
}
