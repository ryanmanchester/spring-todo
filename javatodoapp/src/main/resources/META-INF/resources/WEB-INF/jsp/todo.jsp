<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css"
	rel="stylesheet">
<title>Add To-Do Page</title>
</head>
<body>
	<div class="container">
		<div>Welcome, ${name}!</div>
		<hr>
		<h1>Enter Your New To-Do</h1>
		<form:form method="post" modelAttribute="todo">
			Description: <form:input type="text" path="description" required="required" />
			<input type="submit" class="btn btn-success" />
		</form:form>
		
	</div>
	
	<script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"
			type="text/javascript"></script>
		<script src="webjars/jquery/3.7.1/jquery.min.js"
			type="text/javascript"></script>
</body>

</html>