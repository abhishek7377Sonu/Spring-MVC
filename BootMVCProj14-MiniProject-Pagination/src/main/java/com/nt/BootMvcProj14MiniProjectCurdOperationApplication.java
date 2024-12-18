package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value="classpath:com/nt/validation/Validation.properties")
public class BootMvcProj14MiniProjectCurdOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj14MiniProjectCurdOperationApplication.class, args);
	}

}
