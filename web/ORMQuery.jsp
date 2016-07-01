<%--
  Created by IntelliJ IDEA.
  User: XingYi Wei
  Date: 2016-04-14
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.wxy8866.fromzero.beans.ORMDBUtil"  %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.wxy8866.fromzero.beans.User" %>
<%@ page import="com.wxy8866.fromzero.beans.Page" %>

<jsp:useBean id="db" class="com.wxy8866.fromzero.beans.ORMDBUtil" scope="page" />
<jsp:useBean id="pager" class="com.wxy8866.fromzero.beans.Page" scope="page" />
<%
    String sql = "select * from USER_";
    ArrayList<User> result = db.select(sql);

    int currentRecord = 0;
    pager.setTotalRecord(result.size());
    pager.setTotalPage(pager.getTotalRecord(),pager.getPageSize());
    pager.setCurrentPage(currentRecord,pager.getPageSize());

    if (request.getParameter("currentRecord") != null)
    {
        currentRecord = Integer.parseInt(request.getParameter("currentRecord"));
        pager.setCurrentPage(currentRecord,pager.getPageSize());;
        pager.setCurrentRecord(currentRecord);
    }

    List<User> pageList = null;

    if (currentRecord == 0)
    {
        pageList = result.subList(0, pager.getPageSize());
    }

    if (pager.getCurrentRecord() + pager.getPageSize() < result.size())
        pageList = result.subList(pager.getCurrentRecord(), pager.getCurrentRecord() + pager.getPageSize());
    else
        pageList = result.subList(pager.getCurrentRecord(), result.size());


%>
<html>
<head>
    <title>Split page query example</title>
</head>
<body>
<table width="387" border="1" height="82">
    <tr>
        <td>User ID</td>
        <td>Screenname</td>
    </tr>

    <%
        if (pageList.isEmpty() == false)
        {
            for(User u : pageList)
            {
                out.print("<tr>");
                out.print("<td>" + u.getUserID() + "</td>");
                out.print("<td>" + u.getScreenname() + "</td>");
                out.print("</tr>");
            }
        }
    %>
</table>
<span>
    <font size="2">Total <%=pager.getTotalRecord()%> records | Total <%=pager.getTotalPage()%> pages | current <%=pager.getCurrentPage()%> page | each page has <%=pager.getPageSize()%> records|

    <%
        if ( pager.getCurrentRecord() - pager.getPageSize() < 0 )
            out.print("First Page|");
        else
            out.print("<a href='ORMQuery.jsp?currentRecord=" + (pager.getCurrentRecord()-pager.getPageSize()) +"&pageSize="+ pager.getPageSize() + "'>Previous</a> | ");

        if (pager.getCurrentRecord() + pager.getPageSize() > pager.getTotalRecord())
            out.print("Last Page |");
        else
            out.print("<a href='ORMQuery.jsp?currentRecord=" + (pager.getCurrentRecord()-pager.getPageSize()) +"&pageSize="+ pager.getPageSize() + "'>Next</a> | ");
    %>
    </font>
</span>
</body>
</html>
