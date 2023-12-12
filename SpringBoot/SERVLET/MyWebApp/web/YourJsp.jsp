<%-- 
    Document   : YourJsp
    Created on : 2 Nov, 2023, 4:10:23 PM
    Author     : ACER
--%>

<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <%
        
          Class.forName("com.mysql.cj.jdbc.Driver");
          
          Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_application", "root", "neha@123");
          
          Statement statement = connection.createStatement();
          
          ResultSet resultSet =  statement.executeQuery("select * from Bank_Account");
          
          ResultSetMetaData resultsetMetaData = resultSet.getMetaData();
          
      
    %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Details</title>
    </head>
    <body>
        <table border="1" align="center" >
    <tr>
        <center><h1>Account Details</h1></center>
    </tr>

    <tr>
        <%
           for(int columnIndex=1;columnIndex<= resultsetMetaData.getColumnCount();columnIndex++)
           
            {
       
        %>

        <th><%= resultsetMetaData.getColumnName(columnIndex) %></th>

       
        <%
            }
        %>

    </tr>

   <%
       while (resultSet.next())
       {
   %>
   
   <tr>
       <td><%= resultSet.getString(1)%></td>
       <td><%= resultSet.getString(2)%></td>
       <td><%= resultSet.getString(3)%></td>
       <td><%= resultSet.getString(4)%></td>
       <td><%= resultSet.getString(5)%></td>
       <td><%= resultSet.getInt(6)%></td>
      
        </tr>
       
       
       <%
           }
           
       %>
           
       </table>   
        
    </body>
</html>
