package br.org.rodnet.testeopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TestingOpenFeignApplication {

	public static void main(String[] args) {
		SpringApplication
				.run(TestingOpenFeignApplication.class, args);
	}

}
