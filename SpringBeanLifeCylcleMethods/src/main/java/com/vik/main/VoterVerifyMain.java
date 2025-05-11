package com.vik.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vik.config.AppConfig;
import com.vik.sbeans.VoterVerification;

public class VoterVerifyMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new 
				AnnotationConfigApplicationContext(AppConfig.class);
		
		VoterVerification vvf = ctx.getBean("voterVerification",VoterVerification.class);
		
		String retult = vvf.verifyVoter();
		System.out.println(retult);

	}

}
