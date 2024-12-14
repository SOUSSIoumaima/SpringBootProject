package com.horizon.ecommerceproject.service;

import com.horizon.ecommerceproject.entity.LoginSignup;

import java.util.List;

public interface LoginSignupService {
    public LoginSignup saveLoginSignup(LoginSignup loginSignup);
    public List<LoginSignup> getAllLoginSignup();
}
