package com.example.test_spring_mvc_mkotaro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_mvc_mkotaro.form.ReceiveNameForm;

@Controller
@RequestMapping("/ex03")
public class ReceiveNameController {
    
    @ModelAttribute
    public ReceiveNameForm form(){
        return new ReceiveNameForm();
    }

    @RequestMapping("")
    public String index(){
        return "name-form";
    }

    @RequestMapping("/request")
    public String receiveName(String name){
        System.out.println("入力された名前は" +name+ "です。");
        return "finished";
    }
    @RequestMapping("/request2")
    public String receiveName(ReceiveNameForm form){
        System.out.println("入力された名前は" +form.getName()+ "です。");
        return "finished";
    }
}
