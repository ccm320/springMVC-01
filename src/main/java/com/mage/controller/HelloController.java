package com.mage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping(value = "helloGet",method = RequestMethod.GET)
    @ResponseBody
    public String helloGet() {
        String str="";
        str=str+"hello";
        str=str+" SpringMvc Get";
        return str;
    }
    @RequestMapping(value = "helloPost",method = RequestMethod.POST)
    @ResponseBody
    public String helloPost() {
        String str="";
        str=str+"hello";
        str=str+" SpringMvc Post";
        return str;
    }
}
