<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of Customers</h1>

<hr>
<a href="AddCustomerPage.jsp">Add new customers</a>
<a href="index.jsp">Home Page</a>
<hr>
<!-- Print the customerList -->
<table>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Mobile No</th>
		<th>Email Id</th>
	</tr>
	<c:set var="customerList" value="${sessionScope.customerList }"></c:set>
	<c:forEach items="${customerList}" var="cust" >
	<tr >
		<td>${cust.firstName }</td>
		<td>${cust.lastName }</td>
		<td>${cust.mobileNo }</td>
		<td>${cust.email }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>