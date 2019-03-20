package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/1/16 13:50
 */
@Controller
public class LoginCtroller {

    @RequestMapping("logins")
    public String login(){
        return  "login";
    }
}
