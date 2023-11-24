package com.example.demo.rest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component


public class SavingAccount implements Account{
    @Override
    public String getDetails() {
        return "This is saving Account";
    }
    @PostConstruct
    public void getStart() {
        System.out.println("post Constructor");

    }
    @PostConstruct
    public void getOpen(){
        System.out.println("get details ");
        }

    @PreDestroy
    public void getClose(){
        System.out.println("stop details");
    }

    @PreDestroy
    public void getEnd(){
        System.out.println("pre Destroy");
    }




}
