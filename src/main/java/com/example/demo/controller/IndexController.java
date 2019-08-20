package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: demo
 * @description: 测试springmvcDOMO
 * @author: Marcos-La1y
 * @create: 2019-05-28 15:53
 **/
@Controller
@RequestMapping("index")
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
    @RequestMapping("/show")
    @ResponseBody
    public Object getIndex(Model model){
        model.addAttribute("a","e");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("a","b");
        logger.info("收到数据111");
        return jsonObject;
    }
    @RequestMapping("show1")
    public String getIndex1(HttpServletRequest request){
        request.setAttribute("c","d");
        return "/index";
    }
}
