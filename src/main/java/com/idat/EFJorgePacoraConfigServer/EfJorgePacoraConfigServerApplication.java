package com.idat.EFJorgePacoraConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EfJorgePacoraConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfJorgePacoraConfigServerApplication.class, args);
	}

}
