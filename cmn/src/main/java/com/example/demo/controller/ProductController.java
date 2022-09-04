package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.entity.User;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    /**
     * 增加产品
     */
    @RequestMapping("/add")
    public String addProduct(){
        return "add";
    }


    @PostMapping("/addItem")
    public String addItem(Product product, Model model){
        if (null == product){
            throw new RuntimeException("输入错误");
        }
        productService.addProduct(product);
        return "redirect:main";
    }
    @RequestMapping("/main")
    public String mainPage(Model model){
        List<Product> allProducts = productService.getAllProducts();
        model.addAttribute("allProducts", allProducts);
        return "main";
    }


    /**
     * 删除产品
     */
    @GetMapping("/delete/{pid}")
    @ResponseBody
    public boolean deleteProduct(@PathVariable("pid") int pid){
        System.out.println(pid);
        try {
            productService.deleteProductById(pid);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    /**
     * 批量删除产品
     */


    /**
     * 根据品类查询产品
     */

    /**
     * 根据品类查询产品
     */





}
