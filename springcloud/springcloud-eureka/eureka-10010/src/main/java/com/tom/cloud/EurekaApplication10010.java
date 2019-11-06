package com.tom.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication10010 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication10010.class, args);
    }

}
