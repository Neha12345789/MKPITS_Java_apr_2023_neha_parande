package com.example.DataRestLevel3.Repository;

import com.example.DataRestLevel3.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {


}
