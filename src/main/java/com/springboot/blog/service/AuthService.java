package com.springboot.blog.service;

import com.springboot.blog.payload.LoginDTO;
import com.springboot.blog.payload.RegisterDto;

public interface AuthService {
    String login(LoginDTO loginDTO);
    String register(RegisterDto registerDto);
}
