package com.aos.microservisesapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicesApplicationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesApplicationApplication.class, args);
    }

}
