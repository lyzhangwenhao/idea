package com.tom.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: SpringCloudProvider8001
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/18 0:13
 */
@MapperScan(value = "com.tom.springcloud.mapper")
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudProvider8001 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider8001.class,args);
    }
}
