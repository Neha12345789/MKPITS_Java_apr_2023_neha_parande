/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author ACER
 */
public class EntityClass {
     private String user_id;
     private String pass_word;
     private String customer_name;
     private String address;
     private String city;
     private int balance;

    public EntityClass(String user_id, String pass_word, String customer_name, String address, String city, int balance) {
        this.user_id = user_id;
        this.pass_word = pass_word;
        this.customer_name = customer_name;
        this.address = address;
        this.city = city;
        this.balance = balance;
    }
     
    public EntityClass(){
        
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
     
} 
     
    

  