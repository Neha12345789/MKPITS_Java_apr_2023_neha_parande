package com.example.CRUDOprataion_Using_JpaRepo.Controller;

import com.example.CRUDOprataion_Using_JpaRepo.Entity.Student;
import com.example.CRUDOprataion_Using_JpaRepo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Application")
public class StudentController {
    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/Map/{roll_no}")
    public Student find(@PathVariable int roll_no){
       return studentService.find(roll_no);
    }


}
