package com.ahmad.SpringSecurity;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("healthcheck")
    public String hello() {
        return "Alive";
    }
    
    @GetMapping("session")
    public String session(HttpServletRequest request) {
        return "Session: "+request.getSession().getId();
    }
}
