<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>CryptoArtSale</title>
    </head>
    <body>
        <c:import url="/WEB-INF/jsp/headers/nao_autenticado.jsp"/>

        <div id="create">
            <div class="container">
                <div id="create-row" class="row justify-content-center align-items-center">
                    <div id="create-column" class="col-md-6">
                        <div id="create-box" class="col-md-12" style="padding: 20px; margin: 10px auto; border: #17a2b8 thin solid;">
                            <form action="/password_recovery" method="post">
                                <h3 class="text-center text-info">Confirme o nome e altere a senha de seu usuário</h3>
                                <div class="form-group">
                                    <label for="nome" class="text-info">Nome</label><br>
                                    <input type="text" name="nome" id="nome" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label for="email" class="text-info">Email</label><br>
                                    <input type="email" name="email" id="email" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label for="senha" class="text-info">Nova senha</label><br>
                                    <input type="password" name="senha" id="senha" class="form-control">
                                </div>
                        
                                <button type="submit" class="btn btn-info btn-block">Alterar</button>
                            </form>
                        </div>
                        
                        <a href="/login" class="text-info float-right">Voltar</a>
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
