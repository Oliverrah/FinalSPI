package com.spi.spi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controller.JedyController;

@SpringBootApplication
public class SpiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpiApplication.class, args);
	}

}
