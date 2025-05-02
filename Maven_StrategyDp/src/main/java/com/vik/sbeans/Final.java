package com.vik.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("final")
public class Final 
{
	@Autowired
	@Qualifier("rcb")
	IIpl ipl;	// HAS-A 
	
	public void finalMatch() 
	{
		String msg = ipl.win();
		System.out.println(msg);
	}
}
