package com.meeting.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meeting.model.User;
import com.meeting.service.UserService;

/**
 * Created by zl on 2015/8/27.
 */
@Controller
public class UserController {

    private Logger      logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    public String greeting(Model model) {
        String name = "test";//request.getParameter("name");

        User user = userService.getUserInfo(name);
        if (user != null) {
            System.out.println("user.getName():" + user.getName());
            logger.info("user.getAge():" + user.getAge().toString());
        }
        model.addAttribute("user", user);
        model.addAttribute("name", user.getAge());

        return "index";
    }
}
