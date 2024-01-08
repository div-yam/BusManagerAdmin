package com.busmanageradmin.busmanageradmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class BusmanageradminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusmanageradminApplication.class, args);
	}

}
