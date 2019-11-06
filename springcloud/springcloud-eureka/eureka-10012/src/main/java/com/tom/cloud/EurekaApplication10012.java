package com.tom.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName: EurekaApplication10012
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/19 0:55
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication10012 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication10012.class,args);
    }
}
