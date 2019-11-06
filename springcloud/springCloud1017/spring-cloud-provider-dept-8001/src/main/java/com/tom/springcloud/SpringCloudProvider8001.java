package com.tom.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: SpringCloudProvider8001
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/17 19:57
 */
@MapperScan(value = "com.tom.springcloud.mapper")
@SpringBootApplication
public class SpringCloudProvider8001 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider8001.class,args);
    }
}
