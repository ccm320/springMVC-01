package com.mage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @ResponseBody
    @RequestMapping("/login")
    public String userLogin(){
        return "登陆成功";
    }
    @ResponseBody
    @RequestMapping("/logout")
    public String userLogout(){
        return "退出成功";
    }
}
