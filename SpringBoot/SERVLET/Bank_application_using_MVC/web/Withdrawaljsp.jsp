<%-- 
    Document   : Withdrawaljsp
    Created on : 8 Nov, 2023, 12:54:25 PM
    Author     : ACER
--%>

<%@page import="Service.ServiceClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String name1 =session.getAttribute("user_id").toString();
    %>
<jsp:useBean id="with" class="Service.EntityTransctions" scope="application"></jsp:useBean>
<jsp:setProperty name="with" property="user_id" value="<%=name1%>"></jsp:setProperty>
<jsp:setProperty name="with" property="tran_date" value="<%= new java.sql.Date(session.getCreationTime())%>"></jsp:setProperty>
<jsp:setProperty name="with" property="amount" param="Amount"></jsp:setProperty>
<jsp:setProperty name="with" property="tran_type" value="Withdrawal"></jsp:setProperty>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Withdrawal</title>
    </head>
    <body>
        <%
        ServiceClass serviceClass = new ServiceClass();
        int returnvalue = serviceClass.withdrawal(with);
        
        if(returnvalue!=0){
            
           out.println("Amount Debited Sucsessfully");
           %>
           <a href="welcome.jsp">Back</a>
           <%
        }else{
            
           out.println("Unable to Debit amount");
        }
        
        %>
        
    </body>
</html>
