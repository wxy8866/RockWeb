<%--
  Created by IntelliJ IDEA.
  User: XingYi Wei
  Date: 2016-03-31
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP page forward action and get the params</title>
</head>
<body>
This page is to receive the params.<br>
The previous page pass over parameter value is :
<%
    out.print(request.getParameter("parameter"));
%>
</body>
</html>
