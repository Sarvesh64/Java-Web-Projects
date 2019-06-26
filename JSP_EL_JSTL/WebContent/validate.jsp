<!-- jsp:useBean actions -->
<jsp:useBean id="userObj" 
class="com.validation.el.User" 
scope="session">
</jsp:useBean>
<jsp:setProperty name="userObj" property="*"/>
<%-- <%
out.println(userObj);
%> --%>
<!--setting values for all the properties of User class userObj
	by internally invoking setter method of all the property -->
<h1>Hello , 
	<jsp:getProperty name="userObj" property="username"/>
	<br>Your password is: 
	<jsp:getProperty name="userObj" property="password"/>
	<br>
	and your are a :
	<jsp:getProperty name="userObj" property="status"/>
	 User!
</h1>
<jsp:include page="footer.jsp"></jsp:include>
l>