package com.practice.Rentread.Controller;

import com.practice.Rentread.Entities.Role;
import com.practice.Rentread.Entities.User;
import com.practice.Rentread.Service.RoleService;
import com.practice.Rentread.Service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRolesAndUsers(){
        userService.initRolesAndUser();
    }

    @PostMapping({"/createNewRole"})
    public Role createNewRole (@RequestBody Role role){
        return roleService.createNewRole(role);
    }

    @PostMapping({"/registerNewUser"})
    public User registerNewUser (@RequestBody User user){
        return userService.registerNewUser(user);
    }
}
