package com.akash.uber.uperApp.services;

import com.akash.uber.uperApp.dto.DriverDto;
import com.akash.uber.uperApp.dto.SignupDto;
import com.akash.uber.uperApp.dto.UserDto;
import org.springframework.stereotype.Service;

public interface AuthService {
    String login(String email, String password);
    UserDto signup(SignupDto signupDto);
    DriverDto onboardNewDriver(Long userId);
}
