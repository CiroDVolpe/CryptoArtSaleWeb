<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>CryptoArtSale</title>
</head>
<body>
    <c:import url="/WEB-INF/jsp/headers/autenticado.jsp"/>

    <div class="row justify-content-md-center">
        <div class="col-md-8">
            <div class="col-md-12 text-center" style="padding: 20px; margin: 10px auto; border: #17a2b8 thin solid;">
                Você está logado como: ${user.getNome()} | ${user.getEmail()}
            </div>
        </div>
    </div>


    <c:if test="${empty user}">
        <div class="alert alert-warning">
            <strong>Você deveria estar loggado para acessar aqui!</strong>
        </div>
    </c:if>
</body>
</html>
