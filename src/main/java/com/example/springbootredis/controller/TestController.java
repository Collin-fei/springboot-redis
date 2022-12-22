package com.example.springbootredis.controller;

import com.example.springbootredis.utils.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * @author: Collin
 * @Date: 2022/12/22 9:30
 * @description:
 */
@Controller
public class TestController {
    @Autowired
    private RedisCache redisCache;

    @RequestMapping("/test")
    @ResponseBody
    public void test() {
        redisCache.setCacheObject("test","1111");
        String re = redisCache.getCacheObject("test");
        System.out.println(re);

    }
}
