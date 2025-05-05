package com.vik.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sysInfo")
public class SystemInformation 
{
	// Operating System Name
	@Value("${os.name}")
	private String osName;
	
	// Operating system version
	@Value("${os.version}")
	private double osVersion;

	@Override
	public String toString() {
		return "SystemInformation [Operating System Name = " + osName + ", Operating system version = " + osVersion + "]";
	}
	
	
	
	
}
