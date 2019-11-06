package com.tom.spring.jdbc;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * ClassName: TestJdbc
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/6 17:07
 */
public class TestJdbc {
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate npjt;
    @Before
    public void init(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("com/tom/spring/jdbc/spring-jdbcTemplate.xml");
        jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

        npjt = applicationContext.getBean("namedParameterJdbcTemplate", NamedParameterJdbcTemplate.class);


    }
    /*添加测试*/
    @Test
    public void insertTest(){
        String sql = "insert into user value(?,?,?)";
        int a = jdbcTemplate.update(sql, 13, "a", "123");
        System.out.println(a);
    }

    /*删除测试*/
    @Test
    public void deleteTest(){
        String sql = "delete from user where id = ?";
        int update = jdbcTemplate.update(sql, 13);
        System.out.println(update);
    }

    /*更新测试*/
    @Test
    public void update(){
        String sql = "update user set id = ? ,username = ?, password = ? where id = ?";
        int update = jdbcTemplate.update(sql, 13, "李刘", "abc", 12);
        System.out.println(update);
    }

    /*批量添加*/
    @Test
    public void batchInsert(){
        String sql = "insert into user value(?,?,?)";

        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{21,"a","123"});
        list.add(new Object[]{22,"b","234"});
        list.add(new Object[]{23,"c","345"});
        list.add(new Object[]{24,"d","456"});

        int[] ints = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(ints));
    }

    /*查询单行数据*/
    @Test
    public void queryData(){
        String sql = "select id,username,password from user where id = ?";

        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);

        User user = jdbcTemplate.queryForObject(sql, rowMapper, 13);
        System.out.println(user);
    }

    /*查询单值*/
    @Test
    public void queryData02(){
        String sql = "select count(id) from user";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);
    }

    /*返回多条数据*/
    @Test
    public void queryDataList(){
        String sql = "select id,username,password from user";
        /*方式一*/
        /*RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);*/
        /*方式二*/
        RowMapper<User> rowMapper = new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        };

        List<User> query = jdbcTemplate.query(sql, rowMapper);
        System.out.println(query);
    }

    /*测试具名参数模板类*/
    @Test
    public void testNamedParameterJdbcTemplate(){
        String sql = "insert into user values(:id,:username,:password)";
        /*方式一*/
        /*Map<String,Object> map = new HashMap<>();
        map.put("id",123);
        map.put("username","杨叔子");
        map.put("password","yangshuzi");
        int update = npjt.update(sql, map);*/

        /*方式二*/
        User user = new User(null, "zhangwuji", "zhangwuji");
        SqlParameterSource sqlParameterSource = new BeanPropertySqlParameterSource(user);
        int update = npjt.update(sql, sqlParameterSource);
        System.out.println(update);

    }
}
