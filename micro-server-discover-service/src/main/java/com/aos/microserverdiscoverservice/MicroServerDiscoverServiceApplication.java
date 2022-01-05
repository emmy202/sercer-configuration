package com.aos.microserverdiscoverservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroServerDiscoverServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServerDiscoverServiceApplication.class, args);
    }

}
