<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>登陆</title>
		<meta name="keywords" content="css3, login, form, custom, input, submit, button, html5, placeholder" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/lanrenzhijia.css" />
		
		<style type="text/css">
			.food{
				position: absolute;
				bottom: 10px;
				right: 10px;
			}
		</style>
	</head>

	<body>
		<div class="container">
			<header>
				<h1>Gold <strong>登陆</strong></h1>
				<div>这里写一些公告</div>
				<div class="support-note">
					<span class="note-ie">  </span>
				</div>
			</header>

			<section class="main">
				<form class="form-1" method="post" autocomplete="off">
					<p class="field">
						<input type="text" name="account" maxlength="20" placeholder="请输入账号">
						<i class="">^^</i>
					</p>
					<p class="field">
						<input type="password" name="password" maxlength="20" placeholder="请输入密码">
						<i class="">**</i>
					</p>
					<p class="submit">
						<button type="submit" name="submit">
						
						</button>
					</p>
				</form>
			</section>
		</div>
		<div class="food">
			<span>版权:OMW工作室</span>
		</div>
	</body>

</html>