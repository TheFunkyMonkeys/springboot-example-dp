package com.springbootexample.springbootexampledp.controller;

import com.springbootexample.springbootexampledp.domain.Member;
import com.springbootexample.springbootexampledp.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class HomeController {

    @Autowired
    MemberService memberService;

    @GetMapping("/signUp")
    public String signUp() {

        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(@ModelAttribute Member member) {
        /** void보다 boolean으로 해서 회원가입 성공 여부를 판단하는게 더 좋을듯 **/
//        log.info(member.getLoginId() + " " + member.getPassword());
        memberService.memberSave(member);

        return "login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute Member member) {
        Member loginUser = memberService.login(member);

        if(loginUser == null) {
            return "faildLogin";
        }

        return "index";
    }
}
