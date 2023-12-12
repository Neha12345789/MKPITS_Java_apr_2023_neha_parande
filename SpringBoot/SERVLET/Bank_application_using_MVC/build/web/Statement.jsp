<%-- 
    Document   : Statement
    Created on : 8 Nov, 2023, 3:00:24 PM
    Author     : ACER
--%>

<%@page import="Service.EntityClass"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Service.ServiceClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String name2 =session.getAttribute("user_id").toString();
    %>
<jsp:useBean id="state" class="Service.EntityTransctions" scope="application"></jsp:useBean>
<jsp:useBean id="Maha" class="Service.EntityClass" scope="application"></jsp:useBean>

<jsp:setProperty name="state" property="user_id" value="<%=name2%>"></jsp:setProperty>
<jsp:setProperty name="state" property="amount" param="Amount"></jsp:setProperty>
<jsp:setProperty name="state" property="tran_type" ></jsp:setProperty>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Statement</title>
    </head>
    <body>
        <%
         ServiceClass serviceClass = new ServiceClass();
         ResultSet resultSet = serviceClass.Statement(state);
         
         %>
        
         <table border="1" align="center">
             <th>
                 Transaction Date 
             </th>
             <th>
                 Amount 
             </th>
             <th>
                 Transaction Mode
             </th>
             <%
                 while(resultSet.next())
                 
                 {
                
              %>
             <tr>
                   
                    <td><%=resultSet.getDate(1)%></td>    
                    <td><%=resultSet.getInt(2)%></td>   
                    <td><%=resultSet.getString(3)%></td>   
                    </tr>
             <%
              }
             %>
             
             
        </table>
             <%
                 
                 
                 resultSet = serviceClass.getBalance(name2);
                 resultSet.next();
                 out.println(resultSet.getInt(1));
             
             %>
             
    </body>
</html>
