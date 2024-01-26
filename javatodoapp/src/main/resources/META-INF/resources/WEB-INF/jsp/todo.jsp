<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css"
	rel="stylesheet">

<link href="webjars/bootstrap-datepicker/1.10.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">

</head>
<body>
	<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>
	<div class="container">
		<div>Welcome, ${name}!</div>
		<hr>
		<h1>Enter Your New To-Do</h1>
		<form:form method="post" modelAttribute="todo">
			<fieldset class="mb-3">
				<form:label path="description">Description</form:label>
				<form:input type="text" path="description" required="required" />
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="mb-3">
				<form:label path="targetDate">Target Date</form:label>
				<form:input type="text" path="targetDate" required="required" />
				<form:errors path="targetDate" cssClass="text-warning" />
			</fieldset>
			
			<form:input type="hidden" path="id" />
			<form:input type="hidden" path="done" />
			
			<input type="submit" class="btn btn-success" />
		</form:form>
		
	</div>
	
	<script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"
			type="text/javascript"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js"
			type="text/javascript"></script>
	<script src="webjars/bootstrap-datepicker/1.10.0/js/bootstrap-datepicker.min.js" type="text/javascript"></script>
	<script type="text/javascript">
	$('#targetDate').datepicker({
		format: 'yyyy-mm-dd'
	});
	</script>
</body>

</html>