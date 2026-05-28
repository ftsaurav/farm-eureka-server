package com.coforge.training.farm_service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FarmServiceRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(FarmServiceRegistryApplication.class, args);
    }
}
