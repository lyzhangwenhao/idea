package com.tom.springcloud;

import com.tom.springcloud.entity.Dept;
import com.tom.springcloud.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot06MybatisApplicationTests {

    @Autowired
    private DeptService deptService;
    @Test
    public void contextLoads() {
        List<Dept> allDept = deptService.findAllDept();
        System.out.println(allDept);
    }

}
