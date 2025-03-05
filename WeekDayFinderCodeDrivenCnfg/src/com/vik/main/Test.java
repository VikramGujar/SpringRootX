package com.vik.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vik.cnfg.AppConfig;
import com.vik.sbeans.WeekDayFinder;

public class Test 
{

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Object obj = ctx.getBean("wdf");
		WeekDayFinder finder = (WeekDayFinder) obj;
		
		String msg = finder.showMessage("Vikram");
		System.out.println(msg);
	}

}
