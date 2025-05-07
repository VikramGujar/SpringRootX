package com.vik.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vik.cnfg.AppConfig;
import com.vik.sbeans.ElectricBoard;

public class TestMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		ElectricBoard eleBord = ctx.getBean("electricBoard",ElectricBoard.class);
		
		System.out.println(eleBord.deviceOnCharging());
		ctx.close();

	}

}
