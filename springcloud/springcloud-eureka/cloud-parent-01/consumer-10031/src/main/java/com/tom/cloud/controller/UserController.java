package com.tom.cloud.controller;

import com.netflix.client.ClientRequest;
import com.tom.cloud.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * ClassName: UserController
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/19 9:48
 */
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/consumer/user/list")
    public List<User> findAllUser(){
        ServiceInstance choose = loadBalancerClient.choose("ServerProvide-1002X");
        System.out.println("uri:===="+choose.getUri());
        System.out.println("getInstanceId:===="+choose.getInstanceId());
        System.out.println("getServiceId:===="+choose.getServiceId());
        System.out.println("getHost:===="+choose.getHost());
        int port = choose.getPort();
        System.out.println(port);
        List<User> userList = restTemplate.getForObject("http://ServerProvide-1002X" + "/user/all", List.class);
        return userList;
    }
}
