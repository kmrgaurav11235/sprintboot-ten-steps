package com.gaurav;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SprintbootTenStepsApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SprintbootTenStepsApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = 
				SpringApplication.run(SprintbootTenStepsApplication.class, args);
		LOGGER.info("********* BEANS ******");
		for (String bean : context.getBeanDefinitionNames()) {
			LOGGER.info("{}", bean);
		}
	}

}
