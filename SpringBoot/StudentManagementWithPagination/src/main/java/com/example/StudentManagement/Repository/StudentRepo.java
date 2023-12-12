package com.example.StudentManagement.Repository;

import com.example.StudentManagement.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository <Student,Integer>{
}
