package com.vik.bean;

import org.springframework.stereotype.Component;

@Component("bd")
public class BlueDart implements ICourier {

	@Override
	public String deliver(int id) {
		
		return "is ready with order ID "+id+" to deliver by BlueDart service";
	}

}
