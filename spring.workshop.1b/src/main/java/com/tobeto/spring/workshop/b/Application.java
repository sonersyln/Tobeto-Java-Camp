package com.tobeto.spring.workshop.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// localhost:8080/api/persons

//Annotation
//atandığı argümana özellikler kazandırır
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//Springi devreye alır
		SpringApplication.run(Application.class, args);
	}

}
