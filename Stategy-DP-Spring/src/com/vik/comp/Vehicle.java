package com.vik.comp;

import org.springframework.stereotype.Component;

@Component("vcl")
public class Vehicle 
{
	private Iengine engn;
	
	public Vehicle(Iengine engn)
	{
		this.engn = engn;
	}
	
	public void journy(String start, String end)
	{
		engn.startEngine();
		System.out.println("From "+start);
		
		engn.stopEngine();
		System.out.println("End "+end);
	}
}
