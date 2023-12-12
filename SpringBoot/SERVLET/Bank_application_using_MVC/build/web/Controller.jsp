<%-- 
    Document   : Controller
    Created on : 7 Nov, 2023, 12:06:05 AM
    Author     : ACER
--%>

<%@page import="Service.EntityClass"%>
<%@page import="Service.ServiceClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="bank" class="Service.EntityClass" scope="application"></jsp:useBean>
<jsp:setProperty name="bank" property="user_id" param="Userid"></jsp:setProperty>
<jsp:setProperty name="bank" property="pass_word" param="Pass_word"></jsp:setProperty>
<jsp:setProperty name="bank" property="customer_name" param="Customer_name"></jsp:setProperty>
<jsp:setProperty name="bank" property="address" param="Address"></jsp:setProperty>
<jsp:setProperty name="bank" property="city" param="City"></jsp:setProperty>
<jsp:setProperty name="bank" property="balance" param="Balance"></jsp:setProperty>
    

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
<%
ServiceClass serviceClass = new ServiceClass();
if(serviceClass.insertRecord(bank)!=0){
    out.println("data inserted");
}else{
    out.println("unable to insert data");
}

%>
    </body>
</html>
