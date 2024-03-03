<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
 
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:if test="st">
<c:out value="${st}"></c:out>
</c:if>

<f:form action="okSave" modelAttribute="k">
<table border="3" bgcolor="yellow">
<tr><td>UID</td><td><f:input path="uid"/></td></tr>
<tr><td>Pass</td><td><f:password path="pass"/></td></tr>
<tr><td><input type="submit"></td></tr>
</table>
</f:form>

</body>
</html>