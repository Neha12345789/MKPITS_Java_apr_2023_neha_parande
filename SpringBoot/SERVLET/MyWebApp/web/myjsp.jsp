<%-- 
    Document   : myjsp
    Created on : 2 Nov, 2023, 3:00:18 PM
    Author     : ACER
--%>


<%@page import="java.sql.PreparedStatement"%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <h1>Registration Form</h1>
        <%
            String userid = request.getParameter("User_id");
            String Password = request.getParameter("Pass_word");
            String name = request.getParameter("Customer_name");
            String Address = request.getParameter("Address");
            String City = request.getParameter("City");
            int Balance = Integer.parseInt(request.getParameter("Balance"));
            
            Class.forName("com.mysql.cj.jdbc.Driver");
              out.println("Driver loaded");
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","neha@123");
              out.println("connection established");
              
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Account_Details values(?,?,?,?,?,?)");
            preparedStatement.setString(1,userid);
            preparedStatement.setString(2,Password);
            preparedStatement.setString(3,name);
            preparedStatement.setString(4,Address);
            preparedStatement.setString(5, City);
            preparedStatement.setInt(6,Balance);
            
            int returnValue = preparedStatement.executeUpdate();
            if(returnValue!=0){
              %>
              <%="Account open Successfully"%>
              <%
            }
            else{
             %>
             <%="Accoount not Opened"%>
             <%
            }
             %>
        
    </body>
</html>
