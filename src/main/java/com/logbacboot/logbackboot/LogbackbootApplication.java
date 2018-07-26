package com.logbacboot.logbackboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.logbacboot.logbackboot.service.MyService;

@SpringBootApplication
public class LogbackbootApplication implements CommandLineRunner{

	@Autowired
	private MyService myService;
	public static void main(String[] args) {
		SpringApplication.run(LogbackbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		myService.doStuff("El valor para el properties");
	}
}
