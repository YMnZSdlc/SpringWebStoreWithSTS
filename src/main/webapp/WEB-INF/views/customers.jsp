<%--
  Created by IntelliJ IDEA.
  User: Michał Mielczarek
  Date: 04.10.2018
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
          crossorigin="anonymous">
    <title>Lista Klientów</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Produkty</h1>
            <p>Wszyscy klienci sklepu</p>
        </div>
    </div>
</section>
<section class="container">
    <table class="table-row-cell">
        <tr>
            <th>Numer Id</th>
            <th>Imię i Nazwisko</th>
            <th>Adres</th>
            <th>Ilość zamówień</th>
        </tr>
        <c:forEach items="${customerList}" var="customer">
            <tr>
                <td>${customer.customerId}</td>
                <td>${customer.name}</td>
                <td>${customer.address}</td>
                <td>${customer.noOfOrdersMade}</td>
            </tr>
        </c:forEach>
    </table>
</section>

</body>
</html>
