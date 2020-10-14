package com.first.community.controller;

import com.first.community.entity.User;
import com.first.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/checkLogin")
    public String Login(@RequestParam("username") String username, @RequestParam("password") String password , Model model){
        User user = userService.findByUsername(username);
        if (user == null){
            model.addAttribute("msg","用户不存在");
            return "login";
        }else if (user.getPassword().equals(password)) {
            return "redirect:index";
        }else  {
            model.addAttribute("msg","密码错误");
            return "login";
        }
    }
}
