package com.github.study.spring;

import com.github.study.spring.bean.LanguageService;
import com.github.study.spring.config.AppConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        LanguageService languageService = (LanguageService) context.getBean("languageService");
//        languageService.sayOnLanguage1();
//        languageService.sayOnLanguage2();
        System.out.println(languageService.test());
        languageService.throwSomeException();
    }
}
