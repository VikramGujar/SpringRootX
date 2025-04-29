package com.vik.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vik.beans.TimeGenrator;
import com.vik.cnfig.AppConfig;

public class FieldInjection 
{

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		TimeGenrator tg = ctx.getBean("tg",TimeGenrator.class);
		tg.printTime();
		ctx.close();
	}

}
