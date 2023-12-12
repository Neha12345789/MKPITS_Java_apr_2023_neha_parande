/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mvc_app;

/**
 *
 * @author ACER
 */
public class Student_details {
    private int rollno ; 
    private String name; 
   private int Subject1;
   private int subject2;
   private int subject3;

    public Student_details() {
        
    }

    public Student_details(int rollNo, String name, int Subject1, int subject2, int subject3) {
        this.rollno = rollNo;
        this.name = name;
        this.Subject1 = Subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public int getRollNo() {
        return rollno;
    }

    public void setRollNo(int rollNo) {
        this.rollno = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubject1() {
        return Subject1;
    }

    public void setSubject1(int Subject1) {
        this.Subject1 = Subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public void setSubject3(int subject3) {
        this.subject3 = subject3;
    }
    
    
    
}
