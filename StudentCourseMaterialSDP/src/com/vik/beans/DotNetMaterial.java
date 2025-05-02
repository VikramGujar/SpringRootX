package com.vik.beans;

import org.springframework.stereotype.Component;

@Component("dnm")
public final class DotNetMaterial implements ICourseMaterial
{

	@Override
	public String getCourseMaterial() 
	{
		
		return "Here is your Dot Net Material";
	}

}
