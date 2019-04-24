package cn.yq.shop.controller;

import cn.yq.shop.pojo.Auctionuser;
import cn.yq.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: Jadmin
 * @Date: 2019/4/19 16:49
 * @Version 1.0
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/{page}")
    public  String login(@PathVariable String page){

        return page;
    }

    @RequestMapping("/doLogin")
    public String doLogin(String username, String userpassword, String vrifyCode, HttpSession session, Model model){
        //先判断验证码
        String vCode = (String) session.getAttribute("vrifyCode");
        //如果验证码不正确
       if(!vCode.equals(vrifyCode)){
           model.addAttribute("errMsg","眼睛长哪了？这都看不清？");
           return "login";
       }
        //校验用户名和密码是否正确
        List<Auctionuser> user = userService.doLogin(username, userpassword);

        if (user.size()!=0&& user!=null){
            //取出user对象
            Auctionuser auctionuser = user.get(0);
            //放到session作用域当中
            session.setAttribute("user",auctionuser);
            return "redirect:/selectAllAuction";
        } else {

            model.addAttribute("errMsg","账号或者密码错误");
            return "login";
        }


    }

}

