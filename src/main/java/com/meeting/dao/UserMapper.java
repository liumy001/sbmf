package com.meeting.dao;

import com.meeting.model.User;

/**
 * Created by zl on 2015/8/27.
 */
public interface UserMapper {
     User findUserInfo(String name);
}
