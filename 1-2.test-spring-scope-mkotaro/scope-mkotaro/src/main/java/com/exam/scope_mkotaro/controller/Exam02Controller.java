package com.exam.scope_mkotaro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index(){
        return "exam02";
    }
    ///exam02/calResult
    @RequestMapping("/calResult")
    public String viewResult(Integer num1, Integer num2){
        int result = num1 + num2;
        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        session.setAttribute("result", result);
        return "exam02-result";
    }

    @RequestMapping("/toResult1")
    public String result1(){
        return "exam02-result";
    }

    @RequestMapping("/toResult2")
    public String result2(){
        return "exam02-result2";
    }
}
