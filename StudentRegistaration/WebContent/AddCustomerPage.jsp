<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="include.jsp" />
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-8 offset-md-2">
			<div class="card">
				<div class="card-header">
					<center><h5>Add New Customer</h5></center>
				</div>
				<div class="card-body">
						<form action="CustomerController" method="POST">
							<div class="form-group">
								<label for="customerId">CustomerId: </label>
								<input type="hidden" name="customerId" class="form-control" ><br>
							</div>
							<div class="form-group">
								<label for="firstName">First Name: </label>
								<input type="text" name="firstName" class="form-control"  ><br>
							</div>
							<div class="form-group">
								<label for="lastName">Last Name: </label>
								<input type="text" name="lastName" class="form-control"  ><br>
							</div>
							<div class="form-group">
								<label for="mobileNo">Mobile No: </label>
								<input type="text" name="mobileNo" class="form-control"  ><br>
							</div>
							<div class="form-group">
								<label for="email">Email Id: </label>
								<input type="email" name="email" class="form-control"  ><br>
							</div>
							<input type="submit" value="Register" class="btn btn-success">
							
						</form>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>