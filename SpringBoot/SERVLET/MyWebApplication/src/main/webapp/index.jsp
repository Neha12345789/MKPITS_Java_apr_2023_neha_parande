<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Registration Form" %></h1>
<br/>
<%--<a href="hello-servlet">Hello Servlet</a>--%>

<form action="FirstJspPage.jsp" method="post">

  <label id="userid">User id : </label>
  <input type="text" name="User_id">
  <br><br>
  <label id="password">Password : </label>
    <input type="password" name="Pass_word">
    <br><br>
    <label id="name">Customer Name : </label>
    <input type="text" name="Customer_name">
    <br><br>
    <label id="address">Address : </label>
    <input type="text" name="Address">
    <br><br>
    <label id="city">City : </label>
    <input type="text" name="City">
    <br><br>
    <label id="balance">Balance : </label>
    <input type="number" name="Balance">
    <br><br>
    <input type="submit" value="submit">

</form>


</body>
</html>