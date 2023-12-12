<%-- 
    Document   : loginJsp
    Created on : 7 Nov, 2023, 3:11:56 PM
    Author     : ACER
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Service.ServiceClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="and" class="Service.EntityClass" scope="application"></jsp:useBean>
<jsp:setProperty name="and" property="user_id" param="User_id"></jsp:setProperty>
<jsp:setProperty name="and" property="pass_word" param="Pass_word"></jsp:setProperty>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
       <%
       ServiceClass serviceClass = new ServiceClass();
       ResultSet resultset = serviceClass.login(and);
       
       if(resultset.next()){
       HttpSession httpsession = request.getSession(true);
          httpsession.setAttribute("user_id", and.getUser_id());
            RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
            rd.forward(request, response);
          
          //s out.println("Valid");
       }else{
       out.println("UserId password is incorrect");
       }
       %>
       
    </body>
</html>
