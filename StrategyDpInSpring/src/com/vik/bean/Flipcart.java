package com.vik.bean;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fc")
public class Flipcart 
{
	@Autowired
	ICourier ic;
	
	public String shopping(String product, double price)
	{
		int id =  new Random().nextInt(100, 200);
		
		String msg = ic.deliver(id);
		
		return product+" with price Rs. "+price+" "+msg;
	}
}
