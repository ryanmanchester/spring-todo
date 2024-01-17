<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>
      Welcome to Todo Page
    </title>
  </head>
  <body>
  	<div>Welcome, ${name}!</div>
  	<hr>
  	<h1>Your To-dos are: </h1>
  	<table>
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
  </body>
</html>