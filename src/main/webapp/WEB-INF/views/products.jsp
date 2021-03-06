<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%> --%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
          crossorigin="anonymous">
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
        <c:forEach items="${productsList}" var="product">
            <div class="col-sm-6 col-md-3" style="padding-bottom: 2px">
                <div class="tumbnail">

                    <img src="<c:url value="/resource/images/${product.productId}.png"></c:url>" alt="image"
                         style="width:100%"/>

                    <div class="caption">
                        <h3>Nazwa: ${product.name}</h3>
                        <h5>Typ: ${product.category}</h5>
                        <p>Opis: ${product.description}</p>
                        <p>Cena: ${product.unitPrice}PLN</p>
                        <p>Liczba sztuk: ${product.unitsInStock}</p>
                        <p>
                            <a href="<spring:url value="/products/product?id=${product.productId}"/>"
                               class="btn btn-primary">
                                <span class="glyphicon-info-sign glyphicon"/>Szczegóły</span>
                            </a>
                        </p>
                        <p>ID: ${product.productId}</p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>
<section>
    <div class="jumbotron">
        <div class="container">
            <p><a href="<spring:url value="/products/add" />">
                Dodaj
            </a></p>
        </div>
    </div>
</section>
</body>
</html>