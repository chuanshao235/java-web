package top.gmfcj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "login.html";
    }

}
