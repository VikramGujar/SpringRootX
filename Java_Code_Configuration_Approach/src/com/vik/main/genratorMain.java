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
		DateGenrator genrator = ctx.getBean("dg", DateGenrator.class);
		genrator.printDate();
		ctx.close();
	}
	
}
