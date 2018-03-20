package com.github.study.spring.config;

import com.github.study.spring.impl.English;
import com.github.study.spring.impl.Russian;
import com.github.study.spring.lang.Language;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.github.study.spring.bean","com.github.study.spring.aop"})
public class AppConfig {

    @Bean("eng")
    public Language getEnglish(){
        return new English();
    }

    @Bean("rus")
    public Language getRussian(){
        return new Russian();
    }
}
