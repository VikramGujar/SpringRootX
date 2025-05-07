package com.vik.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vik.cnfg.AppConfig;

public class InternationlisationTest 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter language code : ");
		String lang = sc.nextLine();
		
		System.out.println("Enter contry code : ");
		String contry = sc.nextLine();
		
		// Create locale object
		Locale locale = new Locale(lang, contry);
		
		// Create container
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Get the msg
		String msg = ctx.getMessage("user.msg", new String[] {}, locale);
		
		// Display result
		System.out.println(msg);

		// Close the container
		ctx.close();
	}

}
