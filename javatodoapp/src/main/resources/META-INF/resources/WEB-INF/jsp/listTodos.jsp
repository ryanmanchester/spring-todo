<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css"
	rel="stylesheet">
<title>Welcome to Todo Page</title>
</head>
<body>
	<div class="container">
		<div>Welcome, ${name}!</div>
		<hr>
		<h1>Your To-Dos</h1>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Completed</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.id }</td>
						<td>${todo.description }</td>
						<td>${todo.targetDate }</td>
						<td>${todo.done }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="add-todo" class="btn btn-success">Add To-do</a>
	</div>
	
	<script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"
			type="text/javascript"></script>
		<script src="webjars/jquery/3.7.1/jquery.min.js"
			type="text/javascript"></script>
</body>

</html>