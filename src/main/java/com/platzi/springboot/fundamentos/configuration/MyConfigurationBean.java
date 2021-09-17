package com.platzi.springboot.fundamentos.configuration;

import com.platzi.springboot.fundamentos.bean.MyBeanTwoImplement;
import com.platzi.springboot.fundamentos.bean.MyBeanWithDependency;
import com.platzi.springboot.fundamentos.bean.MyBeanWithDependencyImplement;
import com.platzi.springboot.fundamentos.bean.MyOperation;
import com.platzi.springboot.fundamentos.bean.MyOperationImplement;
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

    @Bean
    public MyOperation beanOperator(){
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency beanOperatorWithDependency(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation);
    }
}