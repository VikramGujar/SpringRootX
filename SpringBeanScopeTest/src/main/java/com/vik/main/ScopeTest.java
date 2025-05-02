package com.vik.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vik.cnfg.AppConfig;
import com.vik.sbeans.ScopePrototype;
import com.vik.sbeans.ScopeSingleton;

public class ScopeTest {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		
		ScopeSingleton ss1 = ctx.getBean("sst",ScopeSingleton.class);
		ScopeSingleton ss2 = ctx.getBean("sst",ScopeSingleton.class);
		
		System.out.println("****** For Singleton Scope ********");
		System.out.println("ss1 equals ss2 = "+ss1.equals(ss2));
		System.out.println("ss1 hashcode = "+ss1.hashCode());
		System.out.println("ss2 hashcode = "+ss2.hashCode());
		System.out.println("************************************");
		System.out.println();
		
		
		
		
		ScopePrototype spt1 = ctx.getBean("spt",ScopePrototype.class); 
		ScopePrototype spt2 = ctx.getBean("spt",ScopePrototype.class);
		
		System.out.println("****** For Prototype Scope ********");
		System.out.println("spt1 equals spt2 = "+spt1.equals(spt2));
		System.out.println("ss1 hashcode = "+spt1.hashCode());
		System.out.println("ss2 hashcode = "+spt2.hashCode());
		System.out.println("************************************");
		System.out.println();
		
		
		
		
		ctx.close();
	}

}
