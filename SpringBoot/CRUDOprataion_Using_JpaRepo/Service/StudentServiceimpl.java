package com.example.CRUDOprataion_Using_JpaRepo.Service;

import com.example.CRUDOprataion_Using_JpaRepo.DAO.StudentRepository;
import com.example.CRUDOprataion_Using_JpaRepo.Entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceimpl implements StudentService{

   private StudentRepository studentRepository;
    @Autowired
    public StudentServiceimpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    @Transactional
    public Student find(Integer roll_no) {
        Optional optional=studentRepository.findById(roll_no);
        Student student = (Student) optional.get();
        return student;
    }
}
