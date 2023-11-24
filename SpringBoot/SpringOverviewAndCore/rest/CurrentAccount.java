package com.example.demo.rest;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class CurrentAccount implements Account{
    @Override
    public String getDetails() {
        return "this is current account";
    }

    public CurrentAccount() {
        System.out.println("Current Account is lazy");
    }
}
