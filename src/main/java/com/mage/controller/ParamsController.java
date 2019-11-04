package com.mage.controller;

import com.mage.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/params")
public class ParamsController {
    @RequestMapping("/getInteger")
    @ResponseBody
    public String getInteger(Integer id ){
        return "我的id是："+id;
    }
    @RequestMapping("/getString")
    @ResponseBody
    public String getString(String name ,String pwd){
        return "我的name是："+name+";我的密码是"+pwd;
    }
    @RequestMapping("/getRequestAndResponse")
    @ResponseBody
    public String getRequestAndResponse(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        return "hh";
    }
    @ResponseBody
    @RequestMapping("/getArrayIds")
    public  String getArrayIds(Integer[] ids ){
        return "hh";
    }
    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser(User user, @RequestParam("id1") Integer id){
        System.out.println(user);
        return "11";
    }
    @RequestMapping("/getList")
    @ResponseBody
    public String getList(User user){
        System.out.println(user);
        return "11";
    }
    @RequestMapping("/getSet")
    @ResponseBody
    public String getSet(User user){
        System.out.println(user);
        return "11";
    }
    @RequestMapping("/getMap")
    @ResponseBody
    public String getMap(User user){
        System.out.println(user);
        return "11";
    }
}
