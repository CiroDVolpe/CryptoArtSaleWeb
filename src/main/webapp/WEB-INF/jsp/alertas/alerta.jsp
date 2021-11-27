<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${not empty msg}">
    <div class="alert alert-warning" role="alert">
        <strong>Alerta!</strong> ${msg}
    </div>
</c:if>
