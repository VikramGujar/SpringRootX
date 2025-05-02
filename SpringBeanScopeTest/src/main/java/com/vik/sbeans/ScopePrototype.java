package com.vik.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("spt")
@Scope("prototype")
public class ScopePrototype 
{

	private ScopePrototype() 
	{
		System.out.println("ScopePrototype Object created");
	}

}
