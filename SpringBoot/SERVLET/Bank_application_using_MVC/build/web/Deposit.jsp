<%-- 
    Document   : Deposit
    Created on : 7 Nov, 2023, 3:42:26 PM
    Author     : ACER
--%>


<%@page import="Service.ServiceClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   String name =session.getAttribute("user_id").toString();
%>
<jsp:useBean id="depo" class="Service.EntityTransctions" scope="application"></jsp:useBean>
    

<jsp:setProperty name="depo" property="user_id" value="<%=name%>"></jsp:setProperty>
<jsp:setProperty name="depo" property="tran_date" value="<%= new java.sql.Date(session.getCreationTime())%>"></jsp:setProperty>
<jsp:setProperty name="depo" property="amount" param="Amount"></jsp:setProperty>
<jsp:setProperty name="depo" property="tran_type" value="Deposit"></jsp:setProperty>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deposit</title>
    </head>
    <body>
        
        
        
        <%
        ServiceClass serviceClass = new ServiceClass();
        int returnvalue = serviceClass.deposit(depo);
        
        if(returnvalue!=0){
            
           out.println("Amount Credited"); 
            %>
           <a href="welcome.jsp">Back</a>
           <%
        }else{
            
           out.println("Unable to Credited amount");
        }
        
        %>
    </body>
</html>
