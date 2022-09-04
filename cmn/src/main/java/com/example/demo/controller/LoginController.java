package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.entity.User;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model){

        User loginUser = userService.getUser(username, password);
        if(loginUser != null){
            //登录成功
            model.addAttribute("loginUser",username);
            List<Product> allProducts = productService.getAllProducts();
            model.addAttribute("allProducts", allProducts);  //最笨的办法，登录成功，顺便把所有产品返给前端
            return "main"; //为防止表单重复提交，可以重定向到主页
        }else{
            //登录失败
            model.addAttribute("info","用户名或密码错误，请重新输入！！！");
            return "login";
        }




    }

}
