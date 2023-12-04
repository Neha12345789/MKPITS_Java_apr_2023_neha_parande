package com.example.CRUDOprataion_Using_JpaRepo.DAO;

import com.example.CRUDOprataion_Using_JpaRepo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
