package com.example.demo.rest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    Account account;
//    Account account1 ;
//    Account account2;

//    @Autowired
//    public void setAccount(Account account) {
//        this.account = account;
//    }
@Autowired
    public Controller(@Qualifier("withdrawal") Account account){
        this.account = account;

    }


    //    public Controller(Account account) {
//        this.account = account;
//    }


    @GetMapping("/details")
    public String getMessage(){
    return "This is Account";
    }


}
