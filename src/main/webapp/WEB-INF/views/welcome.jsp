<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta http-equiv="Content-Type"
			  content="text/html;charset=utf-8">
		<link rel="stylesheet"
			  href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
			  integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
			  crossorigin="anonymous">
		<title>Witaj</title>
	</head>
	<body>
		<section>
			<div class="jumbotron">
				<div class="container">
					<h1> ${greeting} </h1>
					<p> ${tagline} </p>
				</div>
				<div class="modla-footer">
				<p> ${footer} </p>
				</div>
			</div>
		</section>
	</body>
</html>
