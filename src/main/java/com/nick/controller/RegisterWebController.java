package com.nick.controller;

import com.nick.dto.RegisterFormDto;
import com.nick.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

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
        Person single = new Person("nick", 24);

        List<Person> people = new ArrayList<>();
        Person p1 = new Person("andy", 22);
        Person p2 = new Person("jack", 30);
        Person p3 = new Person("lucy", 26);
        Person p4 = new Person("young", 18);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "index";
    }
}
