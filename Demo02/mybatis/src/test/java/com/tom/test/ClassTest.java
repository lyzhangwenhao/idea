package com.tom.test;

import com.tom.entity.ClassEntity;
import com.tom.mapper.ClassMapper;
import com.tom.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName: ClassTest
 * Description:
 *
 * @author Mi_dad
 * @date 2019/9/27 8:44
 */
public class ClassTest {
    private SqlSession session = null;
    @Before
    public void init() throws IOException {
        System.out.println("---------------------init方法执行---------------------");
        /*String resource = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(is);
        session = sqlSession.openSession();*/
        session = SqlSessionUtil.getSqlSession();
    }
    @After
    public void destroy(){
        System.out.println("---------------------destroy方法执行---------------------");
        if(session!=null){
            session.close();
        }
    }
    @Test
    public void getClassById(){
        ClassMapper mapper = session.getMapper(ClassMapper.class);
        ClassEntity classEntity = mapper.getClassById(1);
        /*System.out.println("班级名称："+classEntity.getClassName()+"-----班级人数："+classEntity.getClassNumber());
        System.out.println("---------");*/
        System.out.println(classEntity.getUserInfoEntityList());
    }
}
