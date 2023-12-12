/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mvc_Bank_Package;

/**
 *
 * @author ACER
 */
public class Customer_account {
    
    private String User_id ;
    private String Password ; 
    private String Customer_name ; 
    private String Address ; 
    private String City ; 
    private int Balance ;

    public Customer_account() {
    }

    public Customer_account(String User_id, String Password, String Customer_name, String Address, String City, int Balance) {
        this.User_id = User_id;
        this.Password = Password;
        this.Customer_name = Customer_name;
        this.Address = Address;
        this.City = City;
        this.Balance = Balance;
    }

    public String getUser_id() {
        return User_id;
    }

    public void setUser_id(String User_id) {
        this.User_id = User_id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getCustomer_name() {
        return Customer_name;
    }

    public void setCustomer_name(String Customer_name) {
        this.Customer_name = Customer_name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }
    
    
    
}
