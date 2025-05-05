package com.vik.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vik.config.AppConfig;
import com.vik.sbeans.EnvioromentVariableInfo;
import com.vik.sbeans.PersonInformation;
import com.vik.sbeans.SystemInformation;

public class PropertiesAndValueTest 
{

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		PersonInformation pinfo = ctx.getBean("personInfo",PersonInformation.class);
		System.out.println(pinfo);
		
		System.out.println("\n********************************************\n");
		
		SystemInformation sysInfo = ctx.getBean("sysInfo",SystemInformation.class);
		System.out.println(sysInfo);
		
		System.out.println("\n********************************************\n");
		
		EnvioromentVariableInfo evnInfo = ctx.getBean("envInfo",EnvioromentVariableInfo.class);
		System.out.println(evnInfo);
		ctx.close();
	}

}
