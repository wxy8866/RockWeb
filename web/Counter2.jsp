<%--
  Created by IntelliJ IDEA.
  User: XingYi Wei
  Date: 2016-04-11
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="counter" class="com.wxy8866.fromzero.beans.Counter" scope="application"/>
<html>
<head>
    <title>JavaBean counter example</title>
</head>
<body>
<%
    if (session.isNew())
    {
        long temp = counter.getCounter();
        counter.setCounter(temp);
    }
%>
    <strong>This is a function for displaying a counter by using JavaBean</strong><br>
    Welcome, you are the <jsp:getProperty name="counter" property="counter"/> visitors.<br>

</body>
</html>
