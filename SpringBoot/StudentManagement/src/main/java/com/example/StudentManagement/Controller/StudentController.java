package com.example.StudentManagement.Controller;

import com.example.StudentManagement.Entity.Student;
import com.example.StudentManagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
   private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/addstudent")
   public String save(Model model){
        Student student = new Student();
        model.addAttribute("stud",student);
        return "newStudent";
    }

    @PostMapping("/save")
    public String saveRecord(@ModelAttribute("stud") Student student){
        studentService.save(student);
        return "redirect:/students/displayData";
    }

   @GetMapping("/displayData")
   public String find(Model model){
        List<Student> studentList = studentService.findAll();
        model.addAttribute("students", studentList);
        return "DisplayList";
    }

   @GetMapping("/updateform")
    public String updateForm(@RequestParam("roll_No") int rollno,Model model){
        Student student = studentService.find(rollno);
        model.addAttribute("stud",student);
        return "newStudent";
    }
    @GetMapping("/deleteform")
    public String deleteForm(@RequestParam("roll_No") int rollno,Model model){
        Student student = studentService.delete(rollno);
        model.addAttribute("Stud",student);
        return "redirect:/students/displayData";
    }


}
