package com.vn.ejemplospring.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemospringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemospringApplication.class, args);
		System.out.println(">>>>> APLICAION ARRANCADA <<<<<<<");
		System.out.println(">>>>> A robar se ha dicho <<<<<<<");
		
	}

}
