package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Msh5m6ConfigServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Msh5m6ConfigServerAppApplication.class, args);
	}

}
