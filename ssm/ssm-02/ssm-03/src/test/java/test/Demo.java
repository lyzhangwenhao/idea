package test;

import com.tom.ssm.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * ClassName: Demo
 * Description:
 *
 * @date 2019/10/31 0:30
 * @author: Mi_dad
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:applicationContext.xml"})
public class Demo {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DataSource dataSource;
    @Test
    public void get(){
        System.out.println(userMapper.findAllUser());
    }
}
