<%--
  Created by IntelliJ IDEA.
  User: XingYi Wei
  Date: 2016-04-05
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Validate login page</title>
</head>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username.length()>0 && password.length() >0 )
    {
        session.setAttribute("status","Login");
        response.sendRedirect("Main.jsp");
    }
    else
        response.sendRedirect("Login.jsp");
%>
<body>

</body>
</html>
