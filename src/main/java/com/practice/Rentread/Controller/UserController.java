package com.practice.Rentread.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping("/forAdmin")
    public String forAdmin(){
        return "for admin";
    }

    @GetMapping("/forUser")
    public String forUser(){
        return "for User";
    }
}
