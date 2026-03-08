package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpringBootController {
    @GetMapping("/") // Nếu người dùng request tới địa chỉ "/"
    public String index() {
        return "index"; // Trả về file index.html
    }
}
