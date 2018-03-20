package com.github.study.spring.impl;

import com.github.study.spring.lang.Language;

public class English implements Language {

    @Override
    public String getGreeting() {
        return "Hello";
    }

    @Override
    public String getBye() {
        return "Bye";
    }
}