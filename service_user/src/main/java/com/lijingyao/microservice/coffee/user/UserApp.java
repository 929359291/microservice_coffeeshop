package com.lijingyao.microservice.coffee.user;

import com.lijingyao.microservice.coffee.base.BaseApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by lijingyao on 2018/7/7 14:02.
 */
@SpringBootApplication
public class UserApp {

    public static void main(String[] args) {
        SpringApplication.run(new Class[]{UserApp.class, BaseApp.class}, args);
    }


}
