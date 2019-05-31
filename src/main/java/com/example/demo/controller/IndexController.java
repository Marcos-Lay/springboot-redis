package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: demo
 * @description: 测试springmvcDOMO
 * @author: Marcos-Lay
 * @create: 2019-05-28 15:53
 **/
@Controller
@RequestMapping("index")
public class IndexController {
    @RequestMapping("/show")
    public String getIndex(Model model){
        model.addAttribute("a","e");
        return "/index";
    }
    @RequestMapping("show1")
    public String getIndex1(HttpServletRequest request){
        request.setAttribute("c","d");
        return "/index";
    }

}
