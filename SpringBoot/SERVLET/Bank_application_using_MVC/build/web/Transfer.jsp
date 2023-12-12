<%-- 
    Document   : Transfer
    Created on : 8 Nov, 2023, 6:02:33 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   String name3 =session.getAttribute("user_id").toString();
%>
<jsp:useBean id="Tra" class="Service.EntityTransctions" scope="application"></jsp:useBean>
<jsp:setProperty name="Tra" property="user_id" value="<%=name3%>"></jsp:setProperty>
<jsp:setProperty name="Tra" property="tran_date" value="<%= new java.sql.Date(session.getCreationTime())%>"></jsp:setProperty>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transfer</title>
    </head>
    <body>
        
    </body>
</html>
