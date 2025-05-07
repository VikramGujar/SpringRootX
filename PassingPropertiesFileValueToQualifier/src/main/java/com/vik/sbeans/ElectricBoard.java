package com.vik.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ElectricBoard 
{
	@Autowired
	@Qualifier("device")
	ElectronicDevice ed;
	
	public String deviceOnCharging()
	{
		return ed.charging();
	}
}
