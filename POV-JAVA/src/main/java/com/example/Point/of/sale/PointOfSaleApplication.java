package com.example.Point.of.sale;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PointOfSaleApplication {

	static Logger logger
			= LoggerFactory.getLogger(PointOfSaleApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(PointOfSaleApplication.class, args);
	}


	@PostConstruct
public void init() {
	logger.info("Application started...");
	logger.info("Application started...");
	logger.info("Application started...");
	logger.info("Application started...");
}

}
