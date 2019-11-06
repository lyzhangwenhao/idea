package com.tom.test;

import com.tom.entity.UserEntity;
import com.tom.entity.UserInfoEntity;
import com.tom.mapper.UserInfoMapper;
import com.tom.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ClassName: UserTest
 * Description:
 *
 * @author Mi_dad
 * @date 2019/9/26 14:00
 */
public class UserTest {

    private SqlSession sqlSession = null;
    @Before
    public void init() throws IOException {
        System.out.println("---------------------init方法执行---------------------");
        String resource = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        this.sqlSession = sqlSessionFactory.openSession();
    }
    @After
    public void destroy(){
        System.out.println("---------------------destroy方法执行---------------------");
        if(sqlSession !=null){
            sqlSession.close();
        }
    }
    @Test
    public void findAllUserTest() throws IOException {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<UserEntity> userList = mapper.findAllUser();
        for(UserEntity user:userList){
            System.out.println(user);
        }
    }
    @Test
    public void insertUser() throws IOException {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserEntity user = new UserEntity();
        /*user.setId(14);*/
        user.setUsername("qwe");
        user.setPassword("123456");
        UserEntity user2 = new UserEntity();
        user2.setUsername("asd");
        user2.setPassword("123456");
        mapper.insertUser(user,user2);
        sqlSession.commit();

    }
    @Test
    public void findUserLike() throws IOException {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<UserEntity> userList = mapper.findUserLike("%a%");
        System.out.println(userList);

    }
    @Test
    public void findUserByResultMap(){
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<UserEntity> userList = mapper.findUserByResultMap();
        for(UserEntity user:userList){
            System.out.println(user);
        }
    }
    @Test
    public void findUserInfoByCascade(){
        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        List<UserInfoEntity> userList = mapper.findUserInfoByCascade();
        for(UserInfoEntity userInfo:userList){
            System.out.println(userInfo);
        }
    }

    @Test
    public void findUserInfoByAssociation(){
        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        List<UserInfoEntity> userList = mapper.findUserInfoByAssociation();
        for(UserInfoEntity userInfo:userList){
            System.out.println(userInfo);
        }
    }

    @Test
    public void findUserInfoStep(){
        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        List<UserInfoEntity> userInfoList = mapper.findUserInfoStep();
        for (UserInfoEntity userInfo:userInfoList){
            System.out.println(userInfo);
        }
    }

    /**
     * Mybatis二级缓存机制验证
     */
    @Test
    public void test01() throws Exception{
        String resource = "mybatis-config.xml";
        InputStream its = Resources.getResourceAsStream(resource);
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(its);
        /*获取第一个SqlSession的对象*/
        SqlSession sqlSession1 = ssf.openSession();
        System.out.println("sqlSession1的地址"+sqlSession1);
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        System.out.println("mapper1的地址"+mapper1);
        List<UserEntity> userList1 = mapper1.findAllUser();
        userList1.forEach(n -> System.out.println(n));
        sqlSession1.close();

        System.out.println("--------------------------------------------------------");
        /*获取第二个SqlSession对象*/
        SqlSession sqlSession2 = ssf.openSession();
        System.out.println("sqlSession2的地址"+sqlSession2);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        System.out.println("mapper2的地址"+mapper2);
        List<UserEntity> userList2 = mapper2.findAllUser();
        userList2.forEach(System.out::println);
        sqlSession2.close();

    }
}
