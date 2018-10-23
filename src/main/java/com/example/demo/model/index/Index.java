package com.example.demo.model.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Index {

    @RequestMapping(value = "/index")
    public String index() {
        System.out.println("redirect to Index page!");
        return "index.html";
    }

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        System.out.println("Hello World!");
        return "Hello World!";
    }
}
