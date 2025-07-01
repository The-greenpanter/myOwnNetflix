package com.greenpanter.stream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
}
