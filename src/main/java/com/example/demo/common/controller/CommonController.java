package com.example.demo.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

    @RequestMapping("/")
    public String view() {
        return "login";
    }

    @RequestMapping("/page/{type}/{name}")
    public String toPage(@PathVariable String type, @PathVariable String name) {
        return type + "/" + name;
    }

}
