package com.flightapp.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FlightScheduleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightScheduleServiceApplication.class, args);
	}

}
