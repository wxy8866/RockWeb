<%--
  Created by IntelliJ IDEA.
  User: XingYi Wei
  Date: 2016-03-31
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>request get form information</title>
</head>
<body>
<form action="Form.jsp" method="post">
    username: <input type="text" name="username" size="10">
    password: <input type="password" name="password" size="10">
    <input type="submit" value="Done">
</form>

<%
    String getUsername, getPassword;
    getUsername = request.getParameter("username");
    getPassword = request.getParameter("password");
    if (getUsername != null && getPassowrd!=null && getUsername.length()>0 && getPassword.length()>0)
    {
        out.println("the value of username is " + request.getParameter("username") + "<br>");
        out.println("the value of password is " + request.getParameter("password") + "<br>");
    }
%>
</body>
</html>
