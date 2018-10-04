<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%> --%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Produkty</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Produkty</h1>
				<p>Wszystkie produkty dstępne w sklepie</p>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
				<div class="tumbnail">
					<div class="caption">
						<h3>${product.name}</h3>
						<p>${product.description}</p>
						<p>${product.unitPrice}</p>
						<p>Liczba sztuk: ${product.unitsInStock}</p>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>