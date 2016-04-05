<%--
  Created by IntelliJ IDEA.
  User: XingYi Wei
  Date: 2016-04-05
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User application OBJ to utilize a counter</title>
</head>
<body>
<%
    int count=0;
    if (application.getAttribute("count") == null)
    {
        count++;
        application.setAttribute("count", count);
    }
    else
    {
        count = Integer.parseInt(application.getAttribute("count").toString());
        count ++;
        application.setAttribute("count", count);
    }
    out.print("you are the " +  count + " visitors");
%>

</body>
</html>
