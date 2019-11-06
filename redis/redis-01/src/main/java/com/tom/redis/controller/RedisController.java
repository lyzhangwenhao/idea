package com.tom.redis.controller;

import com.tom.redis.dao.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * ClassName: RedisController
 * Description:
 *
 * @date 2019/10/29 21:39
 * @author: Mi_dad
 */
@RestController
public class RedisController {
    @Autowired
    RedisDao redisDao;

    @RequestMapping(value = "/redis/set",method = RequestMethod.GET)
    public void setString(@RequestParam("key")String key,@RequestParam("value")String value){
        System.out.println("key:"+key+",value:"+value);
        redisDao.setString(key,value);
    }

    @ResponseBody
    @RequestMapping(value = "/redis/get",method = RequestMethod.GET)
    public Set<String> getString(){
        Set<String> keys = redisDao.getString();
        return keys;
    }


}
