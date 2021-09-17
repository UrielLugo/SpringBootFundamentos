package com.platzi.springboot.fundamentos.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency {

    @Autowired
    private MyOperation myOperation;
    
    public MyBeanWithDependencyImplement(MyOperation myOperation){
        this.myOperation = myOperation;
    }
    
    @Override
    public void printWithDependency() {
        int number = 5;
        System.out.println(myOperation.sum(number));
        System.out.println("Hola desde la implentación de un bean con dependencia");
    }
}