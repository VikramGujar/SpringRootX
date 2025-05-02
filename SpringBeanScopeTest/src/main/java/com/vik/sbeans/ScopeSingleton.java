package com.vik.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sst")
//Default scope of any spring bean is singleton 
@Scope("singleton")
public class ScopeSingleton 
{
	
	private ScopeSingleton() 
	{
		System.out.println("ScopeSingleton Object created");
	}
}
