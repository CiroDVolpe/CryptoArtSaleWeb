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
                        <form action="/leilao" method="post">
                            <h3 class="text-center text-info">Cadastre um leilao</h3>
                            <div class="form-group">
                                <label for="responsavel" class="text-info">Responsavel</label><br>
                                <input type="text" name="responsavel" id="responsavel" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="cryptoArte" class="text-info">Crypto Arte</label><br>
                                <input type="text" name="cryptoArte" id="cryptoArte" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="ganhador" class="text-info">Ganhador</label><br>
                                <input type="text" name="ganhador" id="ganhador" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="valorAtual" class="text-info">Valor atual</label><br>
                                <input type="numeric" name="valorAtual" id="valorAtual" class="form-control">
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
