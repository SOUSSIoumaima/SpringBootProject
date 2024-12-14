package com.horizon.ecommerceproject.service;

import com.horizon.ecommerceproject.entity.LoginSignup;
import com.horizon.ecommerceproject.repository.LoginSignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginSignupServiceImpl implements LoginSignupService {
    @Autowired
    private LoginSignupRepository loginSignupRepository;
    @Override
    public LoginSignup saveLoginSignup(LoginSignup loginSignup) {
        return loginSignupRepository.save(loginSignup);
    }

    @Override
    public List<LoginSignup> getAllLoginSignup() {
        return loginSignupRepository.findAll();
    }
}
