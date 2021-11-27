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
                <a href="/funcionario">
                    <button class="btn btn-light btn-block">
                        <span class="text-info">Cadastrar novo funcionario</span>
                    </button>
                </a>
            </div>
        </div>
    </div>

    <c:if test="${not empty listaFuncionarios}">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Email</th>
                    <th scope="col">Telefone</th>
                    <th scope="col">Data de aniversario</th>
                    <th scope="col">Código de trabalho</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="funcionario" items="${listaFuncionarios}" >
                    <tr>
                        <th scope="row"><c:out value="${funcionario.getId()}"/></th>
                        <td><c:out value="${funcionario.getNome()}"/></td>
                        <td><c:out value="${funcionario.getEmail()}"/></td>
                        <td><c:out value="${funcionario.getTelefone()}"/></td>
                        <td><c:out value="${funcionario.getAniversario()}"/></td>
                        <td><c:out value="${funcionario.getCodTrabalho()}"/></td>
                        <td><a href="/funcionario/${funcionario.getId()}/excluir">Excluir</a></td>
                    </tr>
                </c:forEach>
            </tbody>
          </table>
    </c:if>
    
    <c:if test="${empty listaFuncionarios}">
        <div class="row justify-content-md-center">
            <div class="col-md-8">
                <div class="col-md-12 text-center" style="padding: 20px; margin: 10px auto; border: #17a2b8 thin solid;">
                    Não existem funcionarios registrados.
                </div>
            </div>
        </div>
    </c:if>
        
</body>
</html>
