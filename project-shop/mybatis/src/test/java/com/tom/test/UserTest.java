package com.tom.test;

import com.tom.entity.UserBean;
import com.tom.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import sun.misc.Launcher;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

/**
 * ClassName: UserTest
 * Description:
 *
 * @date 2019/9/25 10:48
 * @author Mi_dad
 */
public class UserTest {
    @Test
    public void userTest() throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        System.out.println(sqlSessionFactory);

        SqlSession session = sqlSessionFactory.openSession();

        System.out.println(session);

        try {

//             statement    Unique identifier matching the statement to use.
//              			 SQL语句的唯一标识
//             parameter    A parameter object to pass to the statement.
//             执行SQL需要用到的参数

            UserMapper mapper = session.getMapper(UserMapper.class);
            UserBean user = mapper.getUserByUsernameAndPassword("admin", "admin");
            System.out.println(user);

        } finally {
            session.close();
        }
    }
    @Test
    public void findAllTest() throws Exception{
        String resource = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<UserBean> userList = mapper.findAdd();
            System.out.println("------------------------");
            for(UserBean user:userList){
                System.out.println(user);
            }
        }catch (Exception e){
            sqlSession.close();
        }
    }


    /**
     * 获取根类加载器所加载的核心类库
     */
    @Test
    public void test02(){
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for(URL url:urLs){
            System.out.println(url);
        }
    }
}
