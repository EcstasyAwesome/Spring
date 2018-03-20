package com.github.study.spring.bean;

import com.github.study.spring.lang.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {

    private Language language;
    private Language language2;

    @Autowired
    public LanguageService(@Qualifier("rus") Language language, @Qualifier("eng") Language language2) {
        this.language = language;
        this.language2 = language2;
    }

    public void sayOnLanguage1() {
        System.out.println(language.getGreeting());
        System.out.println(language.getBye());
    }

    public void sayOnLanguage2() {
        System.out.println(language2.getGreeting());
        System.out.println(language2.getBye());
    }

    public String test(){
        System.out.println(language.getGreeting());
        System.out.println(language.getBye());
        System.out.println(language2.getGreeting());
        System.out.println(language2.getBye());
        return "someText";
    }

    public void throwSomeException(){
        throw new ClassCastException();
    }
}