package com.carlinx.cloud.controller;

import com.carlinx.cloud.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author yj
 * @Create 2019/11/16 17:58
 */

@RestController
@RequestMapping("/producer")
public class ProducerController {
    private static final Logger logger = LoggerFactory.getLogger(ProducerController.class);

    @GetMapping("/hello")
    public String hello(String name){
        return "Hello:"+name;
    }


    @GetMapping("/users")
    public List<User> listUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User(1L,"yj",23,new Date()));
        users.add(new User(2L,"zfl",23,new Date()));
        return users;
    }



    @PostMapping("/user")
    public void saveUser(@RequestBody User user){
        logger.info("开始创建user对象");
        logger.info("user对象实体:{}",user.toString());
    }

}
