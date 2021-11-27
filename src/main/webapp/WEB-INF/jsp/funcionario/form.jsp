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
                        <form action="/funcionario" method="post">
                            <h3 class="text-center text-info">Cadastre um cliente</h3>
                            <div class="form-group">
                                <label for="nome" class="text-info">Nome</label><br>
                                <input type="text" name="nome" id="nome" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="email" class="text-info">Email</label><br>
                                <input type="email" name="email" id="email" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="telefone" class="text-info">Telefone</label><br>
                                <input type="text" name="telefone" id="telefone" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="aniversario" class="text-info">aniversario</label><br>
                                <input type="date" name="aniversario" id="aniversario" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="codTrabalho" class="text-info">código de trabalho</label><br>
                                <input type="numeric" name="codTrabalho" id="codTrabalho" class="form-control">
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
