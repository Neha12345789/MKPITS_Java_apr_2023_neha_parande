package com.example.MyFirstApplication.Dao;

import com.example.MyFirstApplication.entity.Student;

public interface StudentDao {

    public void save (Student student);

    public Student read (Integer roll_no);

    public void update(Student student);


}
