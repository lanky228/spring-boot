package com.example.demo.model.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class index {

    @RequestMapping(value = "/index")
    String index() {
        System.out.println("redirect to index page!");
        return "index.html";
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
