package com.vik.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Primary
public class DTDC implements ICourier {

	@Override
	public String deliver(int id) {
		
		return "is ready with order ID "+id+" to deliver by DTDC service";
	}

}
