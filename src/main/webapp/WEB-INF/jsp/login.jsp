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
            
        <div id="login">
            <div class="container">
                <div id="login-row" class="row justify-content-center align-items-center">
                    <div id="login-column" class="col-md-6">
                        <div id="login-box" class="col-md-12" style="padding: 20px; margin: 10px auto; border: #17a2b8 thin solid;">
                            <form action="/login" method="post">
                                
                                <h3 class="text-center text-info">Login</h3>
                                
                                <div class="form-group">
                                    <label for="email" class="text-info">Email</label><br>
                                    <input type="email" name="email" id="email" class="form-control">
                                </div>
                                
                                <div class="form-group">
                                    <label for="senha" class="text-info">Senha</label><br>
                                    <input type="password" name="senha" id="senha" class="form-control">
                                </div>
                                
                                <button type="submit" class="btn btn-info btn-block">Acessar</button>

                            </form>
                            <a href="/usuario">
                                <button class="btn btn-light btn-block" style="margin-top: 1rem;">
                                    <span class="text-info">Cadastre-se aqui!</span>
                                </button>
                            </a>
                        </div>

                        <label for="esqueceu" class="text-info float-right">Esqueceu sua senha? (WIP)</label>
                            
                    </div>
                </div>
            
                <c:if test="${not empty msg}">
                    <div class="alert alert-warning">
                        <strong>Alerta!</strong> ${msg}
                    </div>
                </c:if>
            </div>
        </div>
    </body>
</html>
