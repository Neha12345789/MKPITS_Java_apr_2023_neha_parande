package com.example.SpringBootRestApplication.Service;

import com.example.SpringBootRestApplication.DAO.EmployeeDAO;
import com.example.SpringBootRestApplication.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentDAOServiceImpl implements StudentDAOService{
    private EmployeeDAO employeeDAO;

    @Autowired
    public StudentDAOServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Student> studentDetails() {
     return employeeDAO.findAll();
    }

    @Override
    public Student showSingleDetail(Integer roll_no) {
      Student student =  employeeDAO.OneStudentDetail(roll_no);
      return student;
    }




}
