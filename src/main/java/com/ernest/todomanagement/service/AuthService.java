package com.ernest.todomanagement.service;

import com.ernest.todomanagement.dto.JwtAuthResponse;
import com.ernest.todomanagement.dto.LoginDto;
import com.ernest.todomanagement.dto.RegisterDto;

public interface AuthService {

    String register(RegisterDto registerDto);

    JwtAuthResponse login(LoginDto loginDto);
}
