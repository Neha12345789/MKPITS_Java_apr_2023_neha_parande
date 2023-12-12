/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mvc_app;


import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class Service {
     Connection connection;
    int r = 0; 
     public Service() throws SQLException{
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             out.println("Driver Loaded");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "neha@123");
              out.println("Connection Established");
         } catch (ClassNotFoundException | SQLException ex) {
             System.out.println(ex);
         }
    }
    
    public int InsertRecord(Student_details student) throws SQLException{
          
       PreparedStatement preparedStatement = connection.prepareStatement("insert into Student_details values(?,?,?,?,?)");
       preparedStatement.setInt(1, student.getRollNo());
       preparedStatement.setString(2, student.getName());
       preparedStatement.setInt(3, student.getSubject1());
       preparedStatement.setInt(4, student.getSubject2());
       preparedStatement.setInt(5, student.getSubject3());
       r = preparedStatement.executeUpdate();
       
       return r ;   
        
    }
    
}
