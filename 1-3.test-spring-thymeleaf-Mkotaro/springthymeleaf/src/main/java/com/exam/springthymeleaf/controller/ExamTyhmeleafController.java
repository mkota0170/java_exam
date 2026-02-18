package com.exam.springthymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.springthymeleaf.domain.Member;

@Controller
@RequestMapping("/ex")
public class ExamTyhmeleafController {

    @RequestMapping("")
    public String index() {
        return "ex-thymeleaf-input";
    }

    @RequestMapping("/display")
    public String display(String name, Integer age, String hobby1, String hobby2, String hobby3, Model model) {
        List<String> hobbyList = new ArrayList<>();
        hobbyList.add(hobby1);
        hobbyList.add(hobby2);
        hobbyList.add(hobby3);

        Member member = new Member();
        member.setHobbyList(hobbyList);
        member.setAge(age);
        member.setName(name);

        model.addAttribute("member", member);

        return "ex-thymeleaf-result";
    }
}
