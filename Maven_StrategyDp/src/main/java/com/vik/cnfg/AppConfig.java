package com.vik.cnfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.vik")	// Check in base package for @Component
public class AppConfig 
{

}
