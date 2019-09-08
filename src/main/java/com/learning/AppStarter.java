package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = { "com.learning" })
@ComponentScan({ "com.learning" })
@EnableConfigurationProperties
@EnableAutoConfiguration
public class AppStarter {

	public static void main(String[] args) {
		SpringApplication.run(new Object[] { AppStarter.class }, args);
	}
}