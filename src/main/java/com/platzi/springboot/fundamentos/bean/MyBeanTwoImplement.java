package com.platzi.springboot.fundamentos.bean;

public class MyBeanTwoImplement implements MyBean{

    @Override
    public void print() {
        System.out.println("Hola desde mi segunda implementación del bean");
    }
    
}
