package com.lincker.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProviderServiceApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(ProviderServiceApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
