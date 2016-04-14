<%--
  Created by IntelliJ IDEA.
  User: XingYi Wei
  Date: 2016-04-12
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import = "java.sql.*" %>
<jsp:useBean id="db" class="com.wxy8866.fromzero.beans.DBUtil" scope="page"/>
<%
    String sql = "select * from INSTANCEDT";
    ResultSet rs = db.select(sql);
%>
<html>
<head>
    <title>DB2 connection by JavaBean</title>
</head>
<body>

<table border="1">
    <tr>
        <td>INSTANCEID</td>
        <td>OWNERORGID</td>
        <td>INSTANCECODE</td>
        <td>DISPLAYNAME</td>
    </tr>
    <%
        while (rs.next())
        {
            out.print("<tr>");
            out.print("<td>"+rs.getInt("INSTANCEID")+"</td>");
            out.print("<td>"+rs.getInt("OWNERORGID")+"</td>");
            out.print("<td>" +rs.getString("INSTANCECODE")+"</td>");
            out.print("<td>"+rs.getString("DISPLAYNAME")+"</td>");
            out.print("</tr>");
        }
        if (rs != null)
        {
            rs.close();
        }
    %>
</table>
</body>
</html>
