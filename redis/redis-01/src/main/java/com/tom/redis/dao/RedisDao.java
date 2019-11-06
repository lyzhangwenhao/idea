package com.tom.redis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * ClassName: RedisDao
 * Description:
 *
 * @date 2019/10/29 21:36
 * @author: Mi_dad
 */
@Repository
public class RedisDao {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    /**
     * 向redis中插入String类型数据
     * @param key
     * @param value
     */
    public void setString(String key, String value){
        ValueOperations<String, String> vo = stringRedisTemplate.opsForValue();
        vo.set(key,value);
    }

    public Set<String> getString(){
        Set<String> keys =
                stringRedisTemplate.keys("*");
        return keys;
    }
}
