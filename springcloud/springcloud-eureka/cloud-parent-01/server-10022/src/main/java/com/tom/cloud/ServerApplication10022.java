package com.tom.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: ServerApplication10021
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/18 16:04
 */
@MapperScan(value = "com.tom.cloud.mapper")
@SpringBootApplication
@EnableDiscoveryClient
public class ServerApplication10022 {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication10022.class,args);
    }
}
