package com.horizon.ecommerceproject.controller;

import com.horizon.ecommerceproject.entity.LoginSignup;
import com.horizon.ecommerceproject.service.LoginSignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@CrossOrigin
@RestController
@RequestMapping("/loginsignup")
public class LoginSignupController {
    @Autowired
    private LoginSignupService loginSignupService;
    @PostMapping("/add")
    public  String add(@RequestBody LoginSignup loginSignup){
        loginSignupService.saveLoginSignup(loginSignup);
        return "new login signup added";
    }
    @GetMapping("/getAll")
    public List<LoginSignup> getAllLoginSignup(){
        return loginSignupService.getAllLoginSignup();
    }
}
