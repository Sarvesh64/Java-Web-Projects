<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Session Info</h1>
Session Id: ${pageContext.session.id }
<hr>
Session Creation time: ${pageContext.session.creationTime }
<hr>
Setting the session time out programatically
<%session.setMaxInactiveInterval(2); %><hr>
session Time out :${pageContext.session.maxInactiveInterval }
</body>
</html>