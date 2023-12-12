package com.example.StudentManagement.Service;

import com.example.StudentManagement.Entity.Student;
import com.example.StudentManagement.Repository.StudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class StudentServiceimpl implements StudentService{

    private StudentRepo studentRepo;
    @Autowired
    public StudentServiceimpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    @Transactional
    public void save(Student student) {
       studentRepo.save(student);

    }

    @Override
    public Student delete(Integer roll_No) {
   Student student =  studentRepo.findById(roll_No).get();
     studentRepo.delete(student);
        return student;
    }

    @Override
    public Page<Student> getPages(Pageable pageable) {
        return studentRepo.findAll(pageable);
    }


    @Override
    @Transactional
    public List<Student> findAll() {
        List<Student> studentList = studentRepo.findAll();
        return studentList;

    }

    @Override
    @Transactional
    public Student find(Integer roll_no) {
        Optional<Student> optional= studentRepo.findById(roll_no);
       return optional.get();
    }

//    @Override
//    @Transactional
//    public Student update(Student student) {
//        studentRepo.save(student);
//        return student;
//    }

}
