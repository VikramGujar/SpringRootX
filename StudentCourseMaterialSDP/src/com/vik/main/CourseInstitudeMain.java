package com.vik.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vik.beans.CourseDistributor;
import com.vik.cnfg.AppConfig;

public class CourseInstitudeMain 
{

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		CourseDistributor cd = ctx.getBean("cd",CourseDistributor.class);
		String result = cd.distributor();
		System.out.println(result);
		ctx.close();
	}

}
