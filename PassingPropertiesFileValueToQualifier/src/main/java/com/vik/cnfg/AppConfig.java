package com.vik.cnfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.vik")
@ImportResource(locations = "com/vik/cntx/ApplicationContext.xml")
public class AppConfig 
{

}
