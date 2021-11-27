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
                <a href="/video">
                    <button class="btn btn-light btn-block">
                        <span class="text-info">Cadastrar novo video</span>
                    </button>
                </a>
            </div>
        </div>
    </div>

    <c:if test="${not empty listaVideos}">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Formato</th>
                    <th scope="col">Tamanho</th>
                    <th scope="col">Nome do Artista</th>
                    <th scope="col">Duração</th>
                    <th scope="col">Camera utilizada</th>
                    <th scope="col">FPS</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="video" items="${listaVideos}" >
                    <tr>
                        <th scope="row"><c:out value="${video.getId()}"/></th>
                        <td><c:out value="${video.getNome()}"/></td>
                        <td><c:out value="${video.getFormato()}"/></td>
                        <td><c:out value="${video.getTamanho()}"/></td>
                        <td><c:out value="${video.getNomeArtista()}"/></td>
                        <td><c:out value="${video.getDuracao()}"/></td>
                        <td><c:out value="${video.getCameraUsada()}"/></td>
                        <td><c:out value="${video.getFps()}"/></td>
                        <td><a href="/video/${video.getId()}/excluir">Excluir</a></td>
                    </tr>
                </c:forEach>
            </tbody>
          </table>
    </c:if>
    
    <c:if test="${empty listaVideos}">
        <div class="row justify-content-md-center">
            <div class="col-md-8">
                <div class="col-md-12 text-center" style="padding: 20px; margin: 10px auto; border: #17a2b8 thin solid;">
                    Não existem videos registrados.
                </div>
            </div>
        </div>
    </c:if>
        
</body>
</html>
