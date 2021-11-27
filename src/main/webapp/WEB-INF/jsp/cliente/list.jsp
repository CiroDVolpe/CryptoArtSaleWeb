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
    <c:import url="/WEB-INF/jsp/alertas/criadoExcluido.jsp"/>
    
    <div class="row justify-content-md-center">
        <div class="col-md-8">
            <div class="col-md-12 text-center" style="padding: 20px; margin: 10px auto; border: #17a2b8 thin solid;">
                <a href="/cliente">
                    <button class="btn btn-light btn-block">
                        <span class="text-info">Cadastrar novo cliente</span>
                    </button>
                </a>
            </div>
        </div>
    </div>

    <c:if test="${not empty listaClientes}">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Email</th>
                    <th scope="col">Telefone</th>
                    <th scope="col">Data de aniversario</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="cliente" items="${listaClientes}" >
                    <tr>
                        <th scope="row"><c:out value="${cliente.getId()}"/></th>
                        <td><c:out value="${cliente.getNome()}"/></td>
                        <td><c:out value="${cliente.getEmail()}"/></td>
                        <td><c:out value="${cliente.getTelefone()}"/></td>
                        <td><c:out value="${cliente.getAniversario()}"/></td>
                        <td><a href="/cliente/${cliente.getId()}/excluir">Excluir</a></td>
                    </tr>
                </c:forEach>
            </tbody>
          </table>
    </c:if>
    
    <c:if test="${empty listaClientes}">
        <div class="row justify-content-md-center">
            <div class="col-md-8">
                <div class="col-md-12 text-center" style="padding: 20px; margin: 10px auto; border: #17a2b8 thin solid;">
                    Não existem clientes registrados.
                </div>
            </div>
        </div>
    </c:if>
        
</body>
</html>
