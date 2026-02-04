package com.example.test_spring_mvc_mkotaro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

    @RequestMapping("")
    public String showCompanyIntroduction(){
        return "exam-02";
    }
    @RequestMapping("/show-company-introduction")
    public String showCompanyIntroduction2(){
        return "redirect:/exam02";
    }
}
