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
                        <form action="/imagem" method="post">
                            <h3 class="text-center text-info">Cadastre uma imagem</h3>
                            <div class="form-group">
                                <label for="nome" class="text-info">Nome</label><br>
                                <input type="text" name="nome" id="nome" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="formato" class="text-info">Formato ("jpeg", "svg", "pdf")</label><br>
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
                                <label for="corPredominante" class="text-info">Cor predominante</label><br>
                                <input type="text" name="corPredominante" id="corPredominante" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="somenteDigital" class="text-info">Somente digital</label><br>
                                <input type="checkbox" name="somenteDigital" id="somenteDigital" class="form-control">
                            </div>

                            <button type="submit" class="btn btn-info btn-block">Salvar</button>
                        </form>
                    </div>
                </div>
            </div>

            <c:import url="/WEB-INF/jsp/alertas/alerta.jsp"/>
        </div>
    </div>

</body>
</html>
