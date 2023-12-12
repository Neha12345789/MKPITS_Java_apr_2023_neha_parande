package com.example.DataRestLevel3.Entity;

public class Student {
    private int roll_no;
    private String name;
    private String address;
    private String city;
    private String Gender;
    private String language;
    private String file;

    public Student() {

    }

    public Student(int roll_no, String name, String address, String city) {
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
        this.city = city;
        this.Gender = Gender;
        this.language = language;
        this.file = file;
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

    public String getGender(){
        return Gender;
    }

    public void setGender(String gender){
        this.Gender = gender;
    }
    public String getLanguage(){
        return language;
    }
    public void setLanguage(String language){
        this.language=language;
    }

    public String getFile(){
         return file ;
    }
     public void setFile(String file){
        this.file = file;
     }

}
