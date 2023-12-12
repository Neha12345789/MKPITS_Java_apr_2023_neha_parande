package com.example.StudentManagement.Service;

import com.example.StudentManagement.Entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {
    public List<Student> findAll();

    public Student find(Integer roll_No);

    public void save(Student student);

    public Student delete(Integer roll_No);

//     Page<Student> getpages(Pageable pageable);


}
