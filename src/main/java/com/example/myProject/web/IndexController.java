package com.example.myProject.web;

import com.example.myProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/16.
 */
@RestController
@RequestMapping("/")
public class IndexController {
    @Autowired
    private UserService userService;

    @RequestMapping("")
    String index() {
        return "hello world";
    }

    @RequestMapping("login")
    boolean login(String phone, String password) {
        return userService.login(phone, password);
    }
}
