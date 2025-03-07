package com.vik.comp;

import org.springframework.stereotype.Component;

@Component("ee")
public class ElectricEngine implements Iengine 
{
	@Override
	public void startEngine() 
	{
		System.out.println("ElectricEngine.startEngine()");
		System.out.println("Joueny Started!!!");
		
	}

	@Override
	public void stopEngine() 
	{
		System.out.println("ElectricEngine.stopEngine()");
		System.out.println("Joueny Ended!!!");
		
	}
}
