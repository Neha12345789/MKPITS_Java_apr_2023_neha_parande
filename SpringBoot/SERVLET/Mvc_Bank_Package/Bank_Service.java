/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mvc_Bank_Package;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class Bank_Service {
         Connection connection; 
          int r = 0;
    public Bank_Service() throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        out.println("Driver Loaded");
       connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_application", "root", "neha@123");
       out.println("Connection Establised");
    }
    
    
    public int insertRecord (Customer_account c_account) throws SQLException{
        
 
       PreparedStatement preparedStatement = connection.prepareStatement("insert into Bank_Account values(?,?,?,?,?,?)");
       preparedStatement.setString(1,c_account.getUser_id() );
       preparedStatement.setString(2,c_account.getPassword());
       preparedStatement.setString(3, c_account.getCustomer_name());
       preparedStatement.setString(4, c_account.getAddress());
       preparedStatement.setString(5, c_account.getCity());
       preparedStatement.setInt(6, c_account.getBalance());
       
       r = preparedStatement.executeUpdate();
       
       return r ;
    }
    
}
    

