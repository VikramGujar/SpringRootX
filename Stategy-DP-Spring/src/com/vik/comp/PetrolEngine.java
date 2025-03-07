package com.vik.comp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pe")
@Primary
public class PetrolEngine implements Iengine 
{

	@Override
	public void startEngine() 
	{
		System.out.println("PetrolEngine.startEngine()");
		System.out.println("Joueny Started!!!");
		
	}

	@Override
	public void stopEngine() 
	{
		System.out.println("PetrolEngine.stopEngine()");
		System.out.println("Joueny Ended!!!");
		
	}

}
