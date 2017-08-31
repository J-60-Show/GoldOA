<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加商品</title>
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
			<label>商品名称：</label>
			<form:input path="comName"/>
			</div>
			<div>
			<label>提成点：</label>
			<form:input path="points"/>
			</div>
			<div>
			<label>大分类：</label>
			<form:input path="sort"/>
			</div>
			<form:button>提交</form:button>
		</form:form>
	</div>
</body>
</html>