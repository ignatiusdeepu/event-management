package com.netinsight.scheduall.event.management;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EventManagementApplication {

	private static final Logger logger = LoggerFactory.getLogger(EventManagementApplication.class);
	
	private static final String NI_ENV="NI_ENV";
	
	public static void main(String[] args) {
		logger.debug("Begin EventManagementApplication::main");
		String environment = System.getenv(NI_ENV);
		new SpringApplicationBuilder().sources(EventManagementApplication.class).profiles(environment).build().run(args);
		logger.debug("End EventManagementApplication::main");
	}

}
