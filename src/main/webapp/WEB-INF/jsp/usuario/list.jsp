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

    <table class="table table-striped">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Nome</th>
                <th scope="col">Email</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="usuario" items="${listaUsuarios}" >
                <tr>
                    <th scope="row"><c:out value="${usuario.getId()}"/></th>
                    <td><c:out value="${usuario.getNome()}"/></td>
                    <td><c:out value="${usuario.getEmail()}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
        
</body>
</html>
