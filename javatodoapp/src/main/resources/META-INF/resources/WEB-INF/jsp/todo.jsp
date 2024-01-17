<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
		<form method="post">
			Description: <input type="text" name="description">
			<input type="submit" class="btn btn-success">
		</form>
		
	</div>
	
	<script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"
			type="text/javascript"></script>
		<script src="webjars/jquery/3.7.1/jquery.min.js"
			type="text/javascript"></script>
</body>

</html>