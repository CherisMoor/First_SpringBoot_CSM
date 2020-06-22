package com.myspringboot.springbootproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {
    @RequestMapping("")
    public String index() {
        return "home.html";
    }

    @RequestMapping("/userform")
    public String userForm() {
        return "userForm.html";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome.html";
    }
}