package com.vik.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vik.cnfg.AppConfig;
import com.vik.sbeans.Final;

public class IplMain {

	public static void main(String[] args) 
	{
		// IOC Container creation
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		Final fn = ctx.getBean("final",Final.class);
		fn.finalMatch();
		ctx.close();
	}

}
