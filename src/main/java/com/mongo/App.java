package com.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by zhizhuang.yang on 2017/9/18.
 */
@SpringBootApplication
@ConfigurationProperties("/application.properties")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

}
