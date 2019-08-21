package com.btm.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(BackendApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter("springboot-backend.pid"));
		springApplication.run(args);
	}

}
