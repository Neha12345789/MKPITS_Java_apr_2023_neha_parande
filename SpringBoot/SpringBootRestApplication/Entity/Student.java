package com.example.SpringBootRestApplication.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class Student {


    @Id
    private int roll_no;
    private String name;
    private String address;
    private String city;

    public Student() {

    }

    public Student(int roll_no, String name, String address, String city) {
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
