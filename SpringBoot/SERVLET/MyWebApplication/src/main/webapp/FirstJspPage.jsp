<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %><%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 02-11-2023
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
<%
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver loaded");
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank\",\"root\",\"neha@123");
    System.out.println("Connection Established");
%>
</body>
</html>
