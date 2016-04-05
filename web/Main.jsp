<%--
  Created by IntelliJ IDEA.
  User: XingYi Wei
  Date: 2016-04-05
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Landing page</title>
</head>
<body>
<%
    Object status = session.getAttribute("status");
    if (status != null)
    {
        out.print("Yes, you have been login.");
    }
    else
        response.sendRedirect("Login.jsp");
%>

</body>
</html>
