<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>录入业绩</title>
</head>
<body>

	<form:form method="post" commandName="sell">
	
		<div>
			<label>选择员工</label>
			<select>
				<option value="1">1</option>
				<option value="2">1</option>
				<option value="3">1</option>
				<option value="4">1</option>
				<option value="5">1</option>
			</select>
		</div>
		
		<div>
			<label>选择商品</label>
			<select>
				<option value="1">1</option>
				<option value="2">1</option>
				<option value="3">1</option>
				<option value="4">1</option>
				<option value="5">1</option>
			</select>
		</div>
		
		
		
		
		<div>
			<input type="submit" value="提交">
		</div>
	</form:form>
	
</body>
</html>