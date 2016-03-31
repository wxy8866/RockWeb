<%--
  Created by IntelliJ IDEA.
  User: XingYi Wei
  Date: 2016-03-30
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%
    int firstNum = 0;
    int secondNum = 0;

    String getFirstInput = request.getParameter("firstNumInput");
    String getSecInput = request.getParameter("secNumInput");

    if (getFirstInput!=null && getFirstInput.length()>0)
    {
        firstNum = Integer.parseInt(getFirstInput);
    }

    if (getSecInput != null && getSecInput.length()>0)
    {
        secondNum = Integer.parseInt(getSecInput);
    }
%>
<html>
<head>
    <title>Sum by JSP example</title>
    <script language="javascript">
        function check()
        {
            if (this.document.forms[0].firstNumInput.value.length == 0 )
            {
                alert("Please input a number");
            }
            else if (this.document.forms[0].secNumInput.value.length==0)
            {
                alert("Please input the second number");
            }
            else if (isNaN(this.document.forms[0].firstNumInput.value) || isNaN(this.document.forms[0].secNumInput.value))
            {
                alert("All inputs must be an integer");
            }
            else
                    this.document.forms[0].submit();
        }
    </script>
</head>
<body>
    <form action="Add.jsp" method="get">
        <font size="2">
            Sum of two integers: <br>
            Input 1st num: <input type="text" name="firstNumInput"><br>
            Input 2nd num: <input type="text" name="secNumInput"><br>
            Sum of them is : <%=(firstNum + secondNum)%><br>
            <input type="button" value="Get Sum" onclick="check()"><br>
        </font>
    </form>
</body>
</html>
