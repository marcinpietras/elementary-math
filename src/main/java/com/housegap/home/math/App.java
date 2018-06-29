package com.housegap.home.math;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.housegap.home.math.elementary.controller.ElementaryMathController;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.housegap.home.math.*"}
)
public class App {
	
	private static Logger logger = LoggerFactory.getLogger(ElementaryMathController.class);
	
	public static void main(String[] args) {
		logger.info("ElementaryMath is starting up");
		ApplicationContext ctx = SpringApplication.run(App.class, args);
		logger.info("Beans provided by Spring Boot:");
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
        	logger.info(beanName);
        }
        logger.info("ElementaryMath is up!");
	}
}
