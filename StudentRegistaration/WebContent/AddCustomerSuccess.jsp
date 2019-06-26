<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Customer Added Successfully</h1>
<hr>
<a href="index.jsp">Go to Customer Home</a>
<hr>
<h3>
Customer First Name: ${customer.firstName }<br>
Customer Last Name: ${customer.lastName }<br>
Customer Mobile No: ${customer.mobileNo }<br>
Customer Email: ${customer.email }<br>
</h3>
</body>
</html>