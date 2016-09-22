<%--
  Created by IntelliJ IDEA.
  User: 0100060991
  Date: 2016/9/19
  Time: 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>login</h1>
<c:if test="${customerlist!=null || fn:length(customerlist) != 0}">
    <h1>diaodiaodiao</h1>
</c:if>
<c:forEach items="${customerlist}" var="customer">
    <tr>
        <td>${customer.customerNumber}</td>
        <td>${customer.certificateNumber}</td>
        <td>${customer.certificateType}</td>
    </tr>
</c:forEach>
</body>
</html>
