package com.tom.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName: EurekaApplication10011
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/19 0:43
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication10011 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication10011.class,args);
    }
}
