package com.eazybytes.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigeServerApplication.class, args);
	}

}
