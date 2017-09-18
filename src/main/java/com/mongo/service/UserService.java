package com.mongo.service;

import com.mongo.model.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by zhizhuang.yang on 2017/9/18.
 */
public interface UserService extends MongoRepository<UserInfo,String> {

    UserInfo findByName(String name);

}
