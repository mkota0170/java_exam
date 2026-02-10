package com.exam.scope_mkotaro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.scope_mkotaro.domain.User;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/bonus")
public class ExamBonusController {
    
    @Autowired
    private HttpSession session;

    @RequestMapping("")
    private String index(){
        return "exam-bonus-input";
    } 

    @RequestMapping("/result")
    private String judge(String email, String password,Model model){
        User user = new User();
        if("yamada@sample.com".equals(email) && "yamayama".equals(password)){
            user.setAge(18);
            user.setEmail(email);
            user.setName("山田太郎");
            session.setAttribute("user", user);
            return "exam-bonus-result";
        } else {
            model.addAttribute("result2", "ログインに失敗しました");
            return "exam-bonus-input";
        }
        
    }
}
