package cn.yq.shop.controller;

import cn.yq.shop.pojo.Auctionuser;
import cn.yq.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Jadmin
 * @Date: 2019/4/22 9:46
 * @Version 1.0
 */
@Controller
public class RegisterController {
    @Autowired
    private UserService userService;
    @RequestMapping("/doRegister")
    public String doregister(){

        return "register";
    }
    @RequestMapping("/register")
    public String register(Auctionuser user){
        user.setUserisadmin(0);
        userService.registerUser(user);
        return "redirect:/login";
    }

}
