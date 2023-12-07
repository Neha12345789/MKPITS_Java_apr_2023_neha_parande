package com.example.DataRestLevel3.Controller;

import com.example.DataRestLevel3.Entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController{
@GetMapping("/Registration")
    public String getData(Model model){
        Student student = new Student();
        model.addAttribute("stud", student );
        return "Registration";

    }

    @PostMapping("/ShowData")
    public String displayData(@ModelAttribute ("stud") Student theStudent){
      return "StudentForm";

}



}
