package org.ocean.eureka_client_feign_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EurekaClientFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientFeignClientApplication.class, args);
	}

}
