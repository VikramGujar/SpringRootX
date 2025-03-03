package com.vik.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Driver 
{
	public CarServiceImpl cs;
	
	
	public Driver(CarServiceImpl cs)
	{
		System.out.println("Constructor calll Dirver");
		this.cs = cs;
	}
}
