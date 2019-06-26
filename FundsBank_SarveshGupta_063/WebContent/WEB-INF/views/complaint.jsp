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
						<c:url var="addAction" value="/complaint/add"></c:url>
						<div class="form-group">
							<form:form action="${addAction}" modelAttribute="complaint">
								<table class="table">
									<%-- <c:if test="${!empty complaint.accountId}"> --%>
									<tr>
										<td><form:label path="accountId">
												<spring:message text="Account Id" />
											</form:label></td>
										<td><form:input path="accountId" readonly="true" size="8"
												disabled="true" /> <form:hidden path="accountId" /></td>
									</tr>
									<%-- </c:if>  --%>
									<tr>
										<td><form:label path="branchCode">
												<spring:message text="Branch Code" />
											</form:label></td>
										<td><form:input path="branchCode" /> <form:errors
												path="branchCode" cssClass="errors"></form:errors></td>
									</tr>
									<tr>
										<td><form:label path="emailId">
												<spring:message text="Email Id" />
											</form:label></td>
										<td><form:input path="emailId" /> <form:errors
												path="emailId" cssClass="errors"></form:errors></td>
									</tr>
									<tr>
										<td><form:label path="complaintCategory">
												<spring:message text="Complaint Category" />
											</form:label></td>
										<td><form:input path="complaintCategory" /> <form:errors
												path="complaintCategory" cssClass="errors">
											</form:errors></td>
									</tr>
									<tr>
										<td><form:label path="description">
												<spring:message text="Description" />
											</form:label></td>
										<td><form:input path="description" /> <form:errors
												path="description" cssClass="errors"></form:errors></td>
									</tr>
									<tr>
										<td colspan="2"><c:if
												test="${!empty complaint.accountId}">
												<input type="submit"
													value="<spring:message text= "Edit Complaint"/>" />
											</c:if> <c:if test="${empty complaint.accountId}">
												<input type="submit" class="btn btn-outline-success"
													value="<spring:message text= "Add Complaint"/>" />
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
							<h3>Complaints List</h3>
						</center>
					</div>
					<div class="card-body">
						<c:if test="${!empty getComplaintList}">
							<table class="table">
								<tr>
									<th width="80">Account ID</th>
									<th width="120">branchCode</th>
									<th width="120">emailId</th>
									<th width="120">complaintCategory</th>
									<th width="120">description</th>
									<th width="60">Delete</th>
								</tr>
								<c:forEach items="${getComplaintList}" var="complaint">
									<tr>
										<td>${complaint.accountId}</td>
										<td>${complaint.branchCode}</td>
										<td>${complaint.emailId}</td>
										<td>${complaint.complaintCategory}</td>
										<td>${complaint.description}</td>
										<td><button class="btn btn-outline-warning">
												<a href="<c:url value='/edit/${complaint.accountId}' />"
													style="color: black">Edit </a>
											</button>&nbsp;
											<button class="btn btn-outline-danger">
												<a href="<c:url value='/remove/${complaint.accountId}' />"
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

	<a href="${pageContext.request.contextPath }"/checkStatus"> Check
		Status</a>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/WEB-INF/webjars/js/bootstrap.js"></script>
</body>
</html>
