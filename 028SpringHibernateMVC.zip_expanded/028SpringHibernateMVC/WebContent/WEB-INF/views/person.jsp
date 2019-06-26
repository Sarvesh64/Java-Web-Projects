<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Complaint Page</title>
<link
	href="${pageContext.request.contextPath}/WEB-INF/styles/mystyle.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/WEB-INF/webjars/css/bootstrap.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>
.errors {
	color: red;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-sm-5 ">
				<div class="card border-info mb-3">
					<div class="card-header">
						<center>
							<h3>Add a Complaint</h3>
						</center>
					</div>
					<div class="card-body">
						<c:url var="addAction" value="/person/add"></c:url>
						<div class="form-group">
							<form:form action="${addAction}" modelAttribute="person">
								<table class="table">
									<c:if test="${!empty person.name}">
										<tr>
											<td><form:label path="personId">
													<spring:message text="Account ID" />
												</form:label></td>
											<td><form:input path="personId" readonly="true" size="8"
													disabled="true" /> <form:hidden path="personId" /></td>
										</tr>
									</c:if>
									<tr>
										<td><form:label path="name">
												<spring:message text="Branch Code" />
											</form:label></td>
										<td><form:input path="name" /> <form:errors path="name"
												cssClass="errors"></form:errors></td>
									</tr>
									<tr>
										<td><form:label path="country">
												<spring:message text="Email Id" />
											</form:label></td>
										<td><form:input path="country" /> <form:errors
												path="country" cssClass="errors"></form:errors></td>
									</tr>
									<tr>
										<td><form:label path="category">
												<spring:message text="Complaint Category" />
											</form:label></td>
										<td><form:input path="category" /> <form:errors
												path="category" cssClass="errors"></form:errors></td>
									</tr>
									<tr>
										<td><form:label path="description">
												<spring:message text="Description" />
											</form:label></td>
										<td><form:input path="description" /> <form:errors
												path="description" cssClass="errors"></form:errors></td>
									</tr>
									<tr>
										<td colspan="2"><c:if test="${!empty person.name}">
												<input type="submit"
													value="<spring:message 
					text="Edit Person"/>" />
											</c:if> <c:if test="${empty person.name}">
												<input type="submit" class="btn btn-outline-success"
													value="<spring:message 
					text="Add Person"/>" />
											</c:if></td>
									</tr>
								</table>


							</form:form>
						</div>
					</div>
				</div>
			</div>


			<br>


			<div class="col-sm-7 ">
				<div class="card">
					<div class="card-header">
						<center>
							<h3>Persons List</h3>
						</center>
					</div>
					<div class="card-body">
						<c:if test="${!empty listPersons}">
							<table class="table">
								<tr>
									<th width="80">Person ID</th>
									<th width="120">Person Name</th>
									<th width="120">Person Country</th>
									<th width="60">Edit &nbsp;&nbsp;&nbsp;Delete</th>
								</tr>
								<c:forEach items="${listPersons}" var="person">
									<tr>
										<td>${person.personId}</td>
										<td>${person.name}</td>
										<td>${person.country}</td>
										<td>${person.email}</td>
										<td>${person.category}</td>
										<td>${person.description}</td>
										
										
										<td><button class="btn btn-outline-warning">
												<a href="
			<c:url value='/edit/${person.personId}' />"
													style="color: black">Edit</a>
											</button>&nbsp;
											<button class="btn btn-outline-danger">
												<a href="
			<c:url value='/remove/${person.personId}' />"
													style="color: black">Delete</a>
											</button></td>
									</tr>
								</c:forEach>
							</table>
						</c:if>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/WEB-INF/webjars/js/bootstrap.js"></script>
</body>
</html>
