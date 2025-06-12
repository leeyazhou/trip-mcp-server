package com.github.leeyazhou.trip.mcp.server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author leeyazhou
 */
@SpringBootApplication
public class McpServerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(McpServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
