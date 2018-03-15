package com.example.demo.controller;

import com.example.demo.common.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.concurrent.TimeUnit;

/**
 * @author XHJ
 * redis 实践测试联系
 */
@RestController
@RequestMapping("/str_redis/")
public class DemoController {
    @Autowired
    private StringRedisTemplate redisTemplate;
    @PostMapping("set_map")
    public String set(String para, HttpSession session) {
        //long 是 多少时间 timeunit 是设置时间单位 毫秒 秒 分钟等等
        redisTemplate.opsForValue().set("test"+ Const.i, para,10, TimeUnit.SECONDS);
        session.setAttribute("test","test"+ Const.i);
        System.out.println("test"+ Const.i+"||"+para);
        String str = String.valueOf(redisTemplate.opsForValue().get("test"+Const.i++));
        return str;
//        BoundValueOperations boundValueOperations = redisTemplate.boundValueOps("bon");
//        boundValueOperations.set(para);
//        return String.valueOf(para);
    }
    @GetMapping("get_map")
    public String get(HttpSession session) {
        System.out.println(session.getAttribute("test" ));
        return String.valueOf(redisTemplate.opsForValue().get(session.getAttribute("test" )));
    }

}
