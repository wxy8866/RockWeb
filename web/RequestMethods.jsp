<%--
  Created by IntelliJ IDEA.
  User: XingYi Wei
  Date: 2016-03-31
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is for invoking some methods in request</title>
</head>
<body>

<%
    request.setAttribute("key","hello");
    out.println("key 's value is " + request.getAttribute("key") + "<br>");
    out.println("context path is " + request.getContextPath() + "<br>");
    out.println("Cookies: " + request.getCookies() + "<br>");
    out.println("Host: " + request.getHeader("Host") + "<br>");
    out.println("ServerName: " + request.getServerName() + "<br>");
    out.println("ServerPort: " + request.getServerPort()+"<br>");
    out.println("RemoteAddr: " + request.getRemoteAddr()+"<br>");
    request.removeAttribute("key");
    out.println("After remove the value of key, key's value is " + request.getAttribute("key"));
%>
</body>
</html>
