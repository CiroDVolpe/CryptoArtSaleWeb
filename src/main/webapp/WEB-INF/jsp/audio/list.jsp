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
    
    <c:if test="${not empty nomeCriado}">
        <div class="alert alert-info">
            ${nomeCriado} cadastrado com sucesso!
        </div>
    </c:if>
    
    <c:if test="${not empty nomeExcluido}">
        <div class="alert alert-info">
            ${nomeExcluido} excluido com sucesso!
        </div>
    </c:if>
    
    <div class="row justify-content-md-center">
        <div class="col-md-8">
            <div class="col-md-12 text-center" style="padding: 20px; margin: 10px auto; border: #17a2b8 thin solid;">
                <a href="/audio">
                    <button class="btn btn-light btn-block">
                        <span class="text-info">Cadastrar novo audio</span>
                    </button>
                </a>
            </div>
        </div>
    </div>

    <c:if test="${not empty listaAudios}">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Formato</th>
                    <th scope="col">Tamanho</th>
                    <th scope="col">Nome do Artista</th>
                    <th scope="col">Afinação</th>
                    <th scope="col">Gênero</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="audio" items="${listaAudios}" >
                    <tr>
                        <th scope="row"><c:out value="${audio.getId()}"/></th>
                        <td><c:out value="${audio.getNome()}"/></td>
                        <td><c:out value="${audio.getFormato()}"/></td>
                        <td><c:out value="${audio.getTamanho()}"/></td>
                        <td><c:out value="${audio.getNomeArtista()}"/></td>
                        <td><c:out value="${audio.getAfinacao()}"/></td>
                        <td><c:out value="${audio.getGenero()}"/></td>
                        <td><a href="/audio/${audio.getId()}/excluir">Excluir</a></td>
                    </tr>
                </c:forEach>
            </tbody>
          </table>
    </c:if>
    
    <c:if test="${empty listaAudios}">
        <div class="row justify-content-md-center">
            <div class="col-md-8">
                <div class="col-md-12 text-center" style="padding: 20px; margin: 10px auto; border: #17a2b8 thin solid;">
                    Não existem audios registrados.
                </div>
            </div>
        </div>
    </c:if>
        
</body>
</html>
