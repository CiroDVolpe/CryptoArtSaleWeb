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
    
    <div id="create">
        <div class="container">
            <div id="create-row" class="row justify-content-center align-items-center">
                <div id="create-column" class="col-md-6">
                    <div id="create-box" class="col-md-12" style="padding: 20px; margin: 10px auto; border: #17a2b8 thin solid;">
                        <form action="/video" method="post">
                            <h3 class="text-center text-info">Cadastre um video</h3>
                            <div class="form-group">
                                <label for="nome" class="text-info">Nome</label><br>
                                <input type="text" name="nome" id="nome" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="formato" class="text-info">Formato ("avi", "mp4", "mov")</label><br>
                                <input type="text" name="formato" id="formato" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="tamanho" class="text-info">Tamanho (em kB)</label><br>
                                <input type="number" name="tamanho" id="tamanho" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="nomeArtista" class="text-info">Nome do Artista</label><br>
                                <input type="text" name="nomeArtista" id="nomeArtista" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="duracao" class="text-info">Duracao</label><br>
                                <input type="text" name="duracao" id="duracao" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="cameraUsada" class="text-info">Camera usada</label><br>
                                <input type="text" name="cameraUsada" id="cameraUsada" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="fps" class="text-info">FPS</label><br>
                                <input type="numeric" name="fps" id="fps" class="form-control">
                            </div>
                            

                            <button type="submit" class="btn btn-info btn-block">Salvar</button>
                        </form>
                    </div>
                </div>
            </div>

            <c:if test="${not empty msg}">
                <div class="alert alert-warning" role="alert">
                    <strong>Alerta!</strong> ${msg}
                </div>
            </c:if>
        </div>
    </div>

</body>
</html>
