package com.example.SpringBootRestApplication.DAO;

import com.example.SpringBootRestApplication.Entity.Student;

import java.util.List;

public interface EmployeeDAO {

   public List<Student> findAll();

   public Student OneStudentDetail(Integer roll_no);
}
