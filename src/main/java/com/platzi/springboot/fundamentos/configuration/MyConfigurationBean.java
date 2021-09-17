package com.platzi.springboot.fundamentos.configuration;

import com.platzi.springboot.fundamentos.bean.MyBeanTwoImplement;
import com.platzi.springboot.fundamentos.bean.MyBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        //new MyBeanImplement();
        return new MyBeanTwoImplement();
    }
}