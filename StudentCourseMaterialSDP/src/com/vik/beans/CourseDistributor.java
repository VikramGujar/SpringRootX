package com.vik.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cd")
public class CourseDistributor 
{
	@Autowired
	@Qualifier("pm")
	ICourseMaterial icm;
	
	public String distributor()
	{
		String msg = icm.getCourseMaterial();
		return msg;
	}
}
