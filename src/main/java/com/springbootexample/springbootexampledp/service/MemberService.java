package com.springbootexample.springbootexampledp.service;

import com.springbootexample.springbootexampledp.domain.Member;
import com.springbootexample.springbootexampledp.mapper.MemberMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MemberService {
    @Autowired
    MemberMapper memberMapper;

    public void memberSave(Member member) { memberMapper.memberSave(member);}

    public Member login(Member member) { return memberMapper.login(member);}
}
