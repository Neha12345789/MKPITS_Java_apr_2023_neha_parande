package com.example.demo.config;

import com.example.demo.rest.Account;
import com.example.demo.rest.Withdrawal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WithConfig {
    @Bean
    public Account withdrawal(){
        return new Withdrawal();
    }
}
