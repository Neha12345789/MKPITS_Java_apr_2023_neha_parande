package com.example.SpringBootRestApplication.DAO;

import com.example.SpringBootRestApplication.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
      TypedQuery<Student> typedQuery = entityManager.createQuery("from Student",Student.class);
      return typedQuery.getResultList();
    }

    @Override
    public Student OneStudentDetail(Integer roll_no) {
      return entityManager.find(Student.class,roll_no);
    }


}
