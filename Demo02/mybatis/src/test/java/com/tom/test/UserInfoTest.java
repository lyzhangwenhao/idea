package com.tom.test;

import com.tom.entity.UserInfoEntity;
import com.tom.mapper.UserInfoMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ClassName: UserInfoTest
 * Description:
 *
 * @author Mi_dad
 * @date 2019/9/26 22:27
 */
public class UserInfoTest {
    private SqlSession session = null;
    @Before
    public void init() throws IOException {
        System.out.println("---------------------init方法执行---------------------");
        String resource = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(is);
        session = sqlSession.openSession();
    }
    @After
    public void destroy(){
        System.out.println("---------------------destroy方法执行---------------------");
        if(session!=null){
            session.close();
        }
    }
    @Test
    public void findUserInfoByCascade(){
        UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
        List<UserInfoEntity> userList = mapper.findUserInfoByCascade();
        for(UserInfoEntity userInfo:userList){
            System.out.println(userInfo);
        }
    }

    @Test
    public void findUserInfoByAssociation(){
        UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
        List<UserInfoEntity> userList = mapper.findUserInfoByAssociation();
        for(UserInfoEntity userInfo:userList){
            System.out.println(userInfo);
        }
    }

    @Test
    public void findUserInfoStep(){
        UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
        List<UserInfoEntity> userInfoList = mapper.findUserInfoStep();
        for (UserInfoEntity userInfo:userInfoList){
            System.out.println(userInfo.getUsername());
            System.out.println(userInfo.getClassEntity());
        }
    }
    @Test
    public void getUserInfoById(){
        UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
        UserInfoEntity userInfoEntity = mapper.getUserInfoById(3);
        System.out.println(userInfoEntity);
    }
}
