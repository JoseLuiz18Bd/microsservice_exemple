package br.com.e_commerce_hub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ECommerceHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceHubApplication.class, args);
	}

}
