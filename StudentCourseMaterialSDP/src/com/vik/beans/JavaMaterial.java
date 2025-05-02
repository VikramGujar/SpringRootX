package com.vik.beans;

import org.springframework.stereotype.Component;

@Component("jm")
public final class JavaMaterial implements ICourseMaterial
{

	@Override
	public String getCourseMaterial() 
	{
		
		return "Here is your Java Material";
	}

}
