package com.example.SpringBootRestApplication.Rest;

import com.example.SpringBootRestApplication.Entity.Student;
import com.example.SpringBootRestApplication.Service.StudentDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api")
public class StudentController {
    private StudentDAOService studentDAOService;
    @Autowired
    public StudentController(StudentDAOService studentDAOService) {
        this.studentDAOService = studentDAOService;
    }

    //@GetMapping("/employee")
//    public List<Student> getEmployee(){
//        List<Student> employee = new ArrayList<Student>();
//        employee.add(new Student(101,"neha","Dighori","nagpur"));
//        employee.add(new Student(102,"Pradnya","hasanbagh","Jaitala"));
//        return employee;
//   }
//    @GetMapping("/Employee/{number}")
//    public Student getEmployee(@PathVariable int number){
//       List <Student> employee = new ArrayList<>();
//       employee.add(new Student(101,"Shital","Gandhibagh","Nashik"));
//       employee.add(new Student(102,"teju","Godhani","gondia"));
//       return employee.get(number);
//}

//    @GetMapping("/Student")
//    public List<Student> getStudentList(){
//        return studentDAOService.studentDetails();
//    }
    @GetMapping("/SingleRecord")
    public Student getDetails(){
       return studentDAOService.showSingleDetail(1);
    }


 }



