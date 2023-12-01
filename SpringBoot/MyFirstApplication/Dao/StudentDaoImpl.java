package com.example.MyFirstApplication.Dao;

import com.example.MyFirstApplication.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao{

    EntityManager entityManager;
    @Autowired
    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    @Transactional

    public void save(Student student) {
      entityManager.persist(student);
    }

    public Student read (Integer roll_no){
       return entityManager.find(Student.class,1);
    }

    @Override
    public void update(Student student) {
        entityManager.merge(student);
    }

}
