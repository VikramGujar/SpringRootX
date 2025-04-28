package com.vik.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vik.sbeans.DateAndTimeGenrator;

public class InjectionMain {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		DateAndTimeGenrator genrator = (DateAndTimeGenrator) ctx.getBean("dtg");
		System.out.println(genrator.showMassage("Vikram"));
		ctx.close();
	}

}
