package com.springbootexample.springbootexampledp.domain;

import lombok.Data;

@Data //lombok getter, setter
public class Member {
    private String loginId;
    private String password;
}
