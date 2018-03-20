package com.github.study.spring.impl;

import com.github.study.spring.lang.Language;

public class Russian implements Language {

    @Override
    public String getGreeting() {
        return "Привет";
    }

    @Override
    public String getBye() {
        return "Пока";
    }
}