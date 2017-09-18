package com.mongo.controller;

import com.mongo.model.UserInfo;
import com.mongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhizhuang.yang on 2017/9/18.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("/save")
    public String save(){
        UserInfo userInfo = new UserInfo();
        userInfo.setName("张三");
        userInfo.setAge(50);
        userService.save(userInfo);
        userInfo = new UserInfo();
        userInfo.setName("李四");
        userInfo.setAge(40);
        userService.save(userInfo);
        return "success";
    }

    @RequestMapping("/find")
    public List<UserInfo> find(){
        return userService.findAll();
    }

    @RequestMapping("/findByName")
    public UserInfo findByName(String name){
        return userService.findByName(name);
    }

    @RequestMapping("/findAll")
    public List<UserInfo> findAll(){
        return mongoTemplate.findAll(UserInfo.class);
    }
}
