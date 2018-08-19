package com.nick.controller;

import com.nick.dto.RegisterFormDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

/**
 * 表单验证控制器
 *
 * Created by Nick on 2018/8/19.
 */
@Controller
public class RegisterWebController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/register-page")
    public String toRegisterPage(RegisterFormDto registerFormDto) {
        return "register/registerPage";
    }

    @PostMapping("/register-submit")
    public String registerSubmit(@Valid RegisterFormDto registerFormDto, BindingResult bindingResult) {
        return "register/registerPage";
    }
}
