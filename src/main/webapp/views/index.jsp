<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/9/2
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>用户类型测试</title>
</head>
<body>
<table>
    <c:forEach items="${requestScope.userTypes}" var="u">
        <tr>
            <td>${u.userTypeId}</td>
            <td>${u.userTypeName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
