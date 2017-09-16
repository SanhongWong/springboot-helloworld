package com.example.myProject.service.impl;

import com.example.myProject.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/16.
 */
@Service
public class DefaultUserService implements UserService {
    private static Map<String, String> users;

    static {
        users = new HashMap<>();
        users.put("13700000001", "123456");
    }

    @Override
    public boolean login(String phone, String password) {
        String pwd = users.get(phone);
        return pwd != null && pwd.equals(password);
    }
}
