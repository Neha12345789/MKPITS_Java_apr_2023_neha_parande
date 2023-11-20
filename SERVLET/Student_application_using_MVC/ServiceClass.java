/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ACER
 */
public class ServiceClass {
    Connection connection ;
    int result =0;
    PreparedStatement preparedStatement ;
    public ServiceClass() throws ClassNotFoundException, SQLException {
          
          
        Class.forName("com.mysql.cj.jdbc.Driver");
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "neha@123");
       out.println("driver established");
    }
    public int insertRecord(EntityClass entityClass){
        try{
       preparedStatement = connection.prepareStatement("insert into account_details values(?,?,?,?,?,?)");
       preparedStatement.setString(1,entityClass.getUser_id());
       preparedStatement.setString(2,entityClass.getPass_word());
       preparedStatement.setString(3,entityClass.getCustomer_name());
       preparedStatement.setString(4,entityClass.getAddress());
       preparedStatement.setString(5, entityClass.getCity());
       preparedStatement.setInt(6, entityClass.getBalance());
       result=preparedStatement.executeUpdate();
        }catch(Exception ex){
        out.println(ex);
        }
     
       return result;
  
}
    public ResultSet login(EntityClass entityClass) {
        ResultSet resultset = null;
        try {
            preparedStatement = connection.prepareStatement("select * from account_details where User_id =? and Pass_word=?");
            preparedStatement.setString(1, entityClass.getUser_id());
            preparedStatement.setString(2, entityClass.getPass_word());
                 resultset= preparedStatement.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(ServiceClass.class.getName()).log(Level.SEVERE, null, ex);
        }
      
     return resultset;
   }
    
   public int deposit(EntityTransctions transctions) {
       int returnvalue = 0;
       
        try {
            preparedStatement = connection.prepareStatement("insert into Transctions values (?,?,?,?)");
            preparedStatement.setString(1,transctions.getUser_id());
            preparedStatement.setDate(2,transctions.getTran_date());
            preparedStatement.setInt(3, transctions.getAmount());
            preparedStatement.setString(4, transctions.getTran_type());
           int returnvalue1 = preparedStatement.executeUpdate();
            
            
            preparedStatement = connection.prepareStatement("Update account_details set Balance = Balance + ?  Where User_id = ?");
            preparedStatement.setString(2,transctions.getUser_id());
            preparedStatement.setInt(1, transctions.getAmount());
            returnvalue = preparedStatement.executeUpdate();
             
        } catch (Exception ex) {
            out.println(ex);
        }
       
     return returnvalue ;
   
   }
   public int withdrawal(EntityTransctions transctions){
   int returnvalue = 0;
    try {
            preparedStatement = connection.prepareStatement("insert into Transctions values (?,?,?,?)");
            preparedStatement.setString(1,transctions.getUser_id());
            preparedStatement.setDate(2,transctions.getTran_date());
            preparedStatement.setInt(3, transctions.getAmount());
            preparedStatement.setString(4, transctions.getTran_type());
           int returnvalue1 = preparedStatement.executeUpdate();
            
            
            preparedStatement = connection.prepareStatement("Update account_details set Balance = Balance - ?  Where User_id = ?");
            preparedStatement.setString(2,transctions.getUser_id());
            preparedStatement.setInt(1, transctions.getAmount());
            returnvalue = preparedStatement.executeUpdate();
             
        } catch (Exception ex) {
            out.println(ex);
        }
       
     return returnvalue ;
 
   }

   public ResultSet Statement(EntityTransctions transctions){
       Statement statement;
       ResultSet resultSet = null;
        try {
            
               
             preparedStatement = connection.prepareStatement("select Transction_date, Amount, Transction_type from Transctions where User_id = ? ");
            preparedStatement.setString(1, transctions.getUser_id());
           resultSet= preparedStatement.executeQuery();

        } catch (Exception ex) {
            out.println(ex);
        }

        return resultSet;
           
        
    }
   
   public ResultSet getBalance(String uid){
   
     ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement("select Balance from Account_details where User_id = ?");
            preparedStatement.setString(1,uid);
            resultSet = preparedStatement.executeQuery();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ServiceClass.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   
   return resultSet;
   }













}



    
   

    
    
   

