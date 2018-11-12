package com.nick.controller;

import com.nick.dto.RegisterFormDto;
import com.nick.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * 表单验证控制器
 *
 * Created by Nick on 2018/8/19.
 */
@Controller
public class RegisterWebController {

    @GetMapping("/register-page")
    public String toRegisterPage(RegisterFormDto registerFormDto) {
        return "register/registerPage";
    }

    @PostMapping("/register-submit")
    public String registerSubmit(@Valid RegisterFormDto registerFormDto, BindingResult bindingResult) {
        return "register/registerPage";
    }

    @GetMapping("/index-page")
    public String toIndexPage(Model model) {
        User user = new User("nick", "M");

        List<User> people = new ArrayList<>();
        User p1 = new User("andy", "W");
        User p2 = new User("jack", "M");
        User p3 = new User("lucy", "M");
        User p4 = new User("young", "W");

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        model.addAttribute("singlePerson", user);
        model.addAttribute("people", people);
        return "index";
    }
}
