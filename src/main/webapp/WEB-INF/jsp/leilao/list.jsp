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
                <th scope="col">Funcionario Responsavel</th>
                <th scope="col">CryptoArte</th>
                <th scope="col">Ganhador</th>
                <th scope="col">Valor atual</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="leilao" items="${listaLeiloes}" >
                <tr>
                    <th scope="row"><c:out value="${leilao.getId()}"/></th>
                    <td><c:out value="${leilao.getResponsavel().getNome()}"/></td>
                    <td><c:out value="${leilao.getCryptoArte().getNome()}"/></td>
                    <td>
                        <c:if test="{${leilao.getGanhador()}}">
                            <c:out value="${leilao.getGanhador().getNome()}"/>
                        </c:if>
                    </td>
                    <td><c:out value="${leilao.getValorAtual()}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
        
</body>
</html>
