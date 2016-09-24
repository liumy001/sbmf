package com.meeting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meeting.dao.UserMapper;
import com.meeting.model.User;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(String name) {
        User user = userMapper.findUserInfo(name);
        //User user=null;
        return user;
    }

}
