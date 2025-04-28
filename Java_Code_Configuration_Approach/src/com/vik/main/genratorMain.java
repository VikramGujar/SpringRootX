package com.vik.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vik.beans.DateGenrator;
import com.vik.config.AppConfig;

public class genratorMain 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		DateGenrator genrator = (DateGenrator) ctx.getBean("dg");
		genrator.printDate();
		ctx.close();
	}
	
}
