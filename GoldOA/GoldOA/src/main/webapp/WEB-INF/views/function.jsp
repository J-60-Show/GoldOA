<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html  lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>功能</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/demo.css"/>
		<style type="text/css">
			.nav{
				height: 200px;
			}
			.icons{
				max-width: 80%;
				margin: 0 auto ;
				float: left;
				margin:20px 10% ;
			}
			.icon{
				height: 80px;
				border: solid 7px #336666;
				border-radius: 10px;
				float: left; 
				margin: 20px 20px;
				text-align: center;
			    background: transparent;
			    padding: 1rem 1rem; 
			    -webkit-transition: all .5s ease;
			    transition: all .5s ease;
			    letter-spacing: 1px;
			    outline: none;
			    box-shadow: 20px 38px 34px -26px rgba(0, 0, 0, 0.2);
			    border-radius: 255px 15px 225px 15px/15px 225px 15px 255px;
			}
			.icon:hover{
				box-shadow: 2px 8px 4px -6px rgba(0, 0, 0, 0.3);
			}
			.icon>a{
				color: #000; 
				width:30px;
				line-height: 80px;
				font-weight: bolder;
				text-decoration:none; 
				font-size:20px;
			}
			.food{
				position: absolute;
				bottom: 10px;
				right: 10px;
			}
		</style>
	</head>
	<body>
		<div class="nav"> 
			<span style="float: right;">${sessionScope.account}
			<a href="${pageContext.request.contextPath }/out">注销</a>
			</span> 
		</div>
		<div class="icons">
		
			<div class="icon "><a href="${pageContext.request.contextPath }/sell.html">销售录入</a></div>
				
			<c:choose>
				<c:when test="${accountTable.power==1 }">
					<div class="icon "><a href="${pageContext.request.contextPath }/results.html">业绩报表</a></div>
					<div class="icon "><a href="${pageContext.request.contextPath }/salary.html">工资报表</a></div>
				</c:when>
				<c:when test="${accountTable.power==2 }">
					<div class="icon "><a href="${pageContext.request.contextPath }/results.html">业绩报表</a></div>
					<div class="icon "><a href="${pageContext.request.contextPath }/salary.html">工资报表</a></div>
					<div class="icon "><a href="${pageContext.request.contextPath }/goods.html">商品管理</a></div>
					<div class="icon "><a href="${pageContext.request.contextPath }/staffmanagement.html">账号管理</a></div>
					<div class="icon "><a href="${pageContext.request.contextPath }/other.html">其他</a></div>
				</c:when>
				<c:otherwise > 	
				</c:otherwise>
			</c:choose> 
		</div>
		<div class="food">
			<span>版权:OMW工作室</span>
		</div>
	</body>
</html>

