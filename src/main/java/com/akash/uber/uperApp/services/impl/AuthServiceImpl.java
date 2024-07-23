package com.akash.uber.uperApp.services.impl;

import com.akash.uber.uperApp.dto.DriverDto;
import com.akash.uber.uperApp.dto.SignupDto;
import com.akash.uber.uperApp.dto.UserDto;
import com.akash.uber.uperApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
