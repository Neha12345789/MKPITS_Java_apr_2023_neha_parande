package com.example.SpringBootRestApplication.Service;

import com.example.SpringBootRestApplication.Entity.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentDAOService {
    public List<Student> studentDetails();

    public Student showSingleDetail(Integer roll_no);

}
