<%--
  Created by IntelliJ IDEA.
  User: XingYi Wei
  Date: 2016-03-31
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Forward action example</title>
</head>
<body>
    <jsp:forward page="GetParam.jsp">
        <jsp:param name="parameter" value="Hello!"></jsp:param>
    </jsp:forward>
</body>
</html>
