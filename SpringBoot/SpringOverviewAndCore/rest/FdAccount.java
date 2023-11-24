package com.example.demo.rest;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FdAccount implements Account{
    @Override
    public String getDetails() {
        return "Lazy Initialization";
    }

    public FdAccount() {
        System.out.println("Fd Account is Lazy");
    }
}
