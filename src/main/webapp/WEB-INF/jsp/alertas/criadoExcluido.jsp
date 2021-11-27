<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
