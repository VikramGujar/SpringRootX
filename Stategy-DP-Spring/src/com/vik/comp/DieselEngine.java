package com.vik.comp;

import org.springframework.stereotype.Component;

@Component("de")
public class DieselEngine implements Iengine 
{
	@Override
	public void startEngine() 
	{
		System.out.println("DieselEngine.startEngine()");
		System.out.println("Joueny Started!!!");
		
	}

	@Override
	public void stopEngine() 
	{
		System.out.println("DieselEngine.stopEngine()");
		System.out.println("Joueny Ended!!!");
		
	}
}
