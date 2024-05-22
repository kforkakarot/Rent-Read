package com.practice.Rentread.Service;

import com.practice.Rentread.Entities.User;
import com.practice.Rentread.dto.JwtAuthenticationResponse;
import com.practice.Rentread.dto.SignInRequest;
import com.practice.Rentread.dto.SignUpRequest;

public interface AuthenticationService {
    User signUp(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signin(SignInRequest signInRequest);
}
