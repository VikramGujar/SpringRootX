package com.vik.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vik.cnfg.AppConfig;
import com.vik.comp.Vehicle;

public class StatergyPatternTest 
{

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Vehicle vcl= ctx.getBean("vcl",Vehicle.class);
		
		vcl.journy("HYD", "Home");
		
		ctx.close();

	}

}
