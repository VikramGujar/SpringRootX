package com.vik.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("envInfo")
public class EnvioromentVariableInfo 
{
	// Environment Variable information [ Path ]
	@Value("${Path}")
	private String pathData;

	@Override
	public String toString() {
		return "EnvioromentVariableInfo [Path Data = " + pathData + "]";
	}
	
	
}
