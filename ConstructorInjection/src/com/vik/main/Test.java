package com.vik.main;

import com.vik.sbeans.Driver;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/vik/config/ApplicationContext.xml");
		
		Driver drv = ctx.getBean("dr",Driver.class);
		
		drv.cs.startEngine();
		
		

	}

}
