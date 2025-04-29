package com.vik.main;

import com.vik.comp.ICar;
import com.vik.factory.CarFactory;

public class FactoryTest {

	public static void main(String[] args) 
	{
		CarFactory cf = new CarFactory();
		ICar car = cf.getInstanceOf("Fastest");
		car.drive();

	}

}
