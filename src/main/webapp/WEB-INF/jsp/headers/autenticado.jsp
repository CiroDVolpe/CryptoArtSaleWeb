<div class="p-5 text-center text-black" style="background-image: linear-gradient(#17a2b8, #f8f9fa);">
    <c:import url="/WEB-INF/jsp/headers/nao_autenticado.jsp"/>

    <nav class="navbar navbar-expand-lg navbar-light bg-light navbar-collapse">
        <ul class="navbar-nav mr-auto">
            <a class="navbar-brand" href="/">CryptoArtSale</a>
            <li class="nav-item active">
                <a class="nav-link" href="/usuario/list">Usuários</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/leilao/list">Leilões</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/audio/list">Audio</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/imagem/list">Imagem</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/video/list">Video</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/cliente/list">Clientes</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/funcionario/list">Funcionários</a>
            </li>
        </ul>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link" href="#">${user.getEmail()} |</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/logout">Logout</a>
            </li>
        </ul>
    </nav>
</div>