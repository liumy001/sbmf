package com.meeting.controller;


import com.meeting.config.EmailSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meeting.model.User;
import com.meeting.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zl on 2015/8/27.
 */
@Controller
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Resource(name = "emailSender")
    private EmailSender emailSender;

    @RequestMapping("/getUserInfo")
    public String greeting(Model model,HttpServletRequest request) {
        String name = "test";//request.getParameter("name");

        User user = userService.getUserInfo(name);
        if (user != null) {
            System.out.println("user.getName():" + user.getName());
            logger.info("user.getAge():" + user.getAge().toString());
        }

        request.getSession().setAttribute("k","1");

        logger.info("--------------------------------------------------------------"+request.getSession().getAttribute("k"));

        model.addAttribute("user", user);
        model.addAttribute("name", user.getAge());

        emailSender.sender("407231704@qq.com","测试邮件","测试");

        return "index";
    }
}
