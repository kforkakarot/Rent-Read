package com.practice.Rentread.Service;

import com.practice.Rentread.Entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    User registerNewUser(User user);
    UserDetailsService userDetailsService();
}
