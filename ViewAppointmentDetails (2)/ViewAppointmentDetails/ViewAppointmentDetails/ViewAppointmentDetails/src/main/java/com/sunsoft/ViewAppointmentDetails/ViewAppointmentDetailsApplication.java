package com.sunsoft.ViewAppointmentDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.sunsoft.ViewAppointmentDetails"})
public class ViewAppointmentDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViewAppointmentDetailsApplication.class, args);
	}

}
