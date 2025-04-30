package com.vik.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vik.bean.Flipcart;
import com.vik.cnfg.AppConfig;

public class StratgyDpTest 
{

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Flipcart fc = ctx.getBean("fc",Flipcart.class);
		String msg = fc.shopping("Laptop", 70000.00);
		System.out.println(msg);
		ctx.close();
	}

}
