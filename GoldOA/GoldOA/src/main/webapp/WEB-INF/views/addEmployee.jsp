<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加员工</title>
	<style type="text/css">
		body {
		text-align: center;
	}
	.container{
		margin: 0 auto;
	}
	</style>
</head>
<body>

	<div class="container">
		<form:form method="post" commandName="employee">
			<div>
			<label>员工姓名：</label>
			<form:input path="name"/>
			</div>
			<div>
			<label>员工姓名：</label>
			<form:input path="name"/>
			</div>
			<div>
			<label>员工姓名：</label>
			<form:input path="name"/>
			</div>
			<div>
			<label>员工姓名：</label>
			<form:input path="name"/>
			</div>
			<div>
			<label>员工姓名：</label>
			<form:input path="name"/>
			</div>
			<div>
			<label>员工姓名：</label>
			<form:input path="name"/>
			</div>
		</form:form>
	</div>
</body>
</html>