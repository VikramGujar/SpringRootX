package com.vik.beans;

import org.springframework.stereotype.Component;

@Component("pm")
public final class PythonMateriall implements ICourseMaterial
{

	@Override
	public String getCourseMaterial() 
	{
		
		return "Here is your Python Material";
	}

}
