# CryptoArtSaleWeb - Ciro Della Volpe
Projeto incremental para a disciplina de Desenvolvimento Web com Java 💻 ☕

- Para executar o projeto, execute o arquivo CryptoartsalewebApplication.java
- O banco irá ser auto-criado, então não precisa se preocupar.
- O banco iniciará limpo, porém é adicionado de maneira incremental, logo criar um usuário já funcionará para diversos testes.

### Documentação Rest
A aplicação disponibiliza dois endpoints para integir via REST, sendo eles:
###### GET /api/audio - Listar audios
Esse método retornara uma lista em json dos audios cadastrados no sistema.
Não exige body.

Exemplo de consumo:
<img width="875" alt="Captura de Tela 2021-11-26 às 22 24 11" src="https://user-images.githubusercontent.com/28911035/143663916-de23d26a-f764-42e7-8a48-560d7112df77.png">

###### POST /api/audio - Criar audio
Esse método exige um body no formato de um audio em json e retorna o mesmo contendo o id cadastrado no sistema.
Exemplo de body para cópia:
`{
	"nome": "Cri-cri-cri",
	"formato": "mp3",
	"tamanho": 123.0,
	"nomeArtista": "Grilado",
	"afinacao": "G e Am",
	"genero": "Brasil House"
}`

Exemplo de consumo:
<img width="856" alt="Captura de Tela 2021-11-26 às 22 27 00" src="https://user-images.githubusercontent.com/28911035/143664029-44c12e8f-a172-432f-88f5-4ead79d0a83f.png">

### Link para aplicação REST que consome a api disposta acima
https://github.com/CiroDVolpe/Consumer

###### Imagens mostrando seu consumo
Criação: <br>
<img width="836" alt="Captura de Tela 2021-11-26 às 22 31 35" src="https://user-images.githubusercontent.com/28911035/143664101-56e63ac4-4fe9-4227-8215-a6bca896bb29.png"><br>
Listagem: <br>
<img width="862" alt="Captura de Tela 2021-11-26 às 22 31 44" src="https://user-images.githubusercontent.com/28911035/143664104-46782a85-09af-4195-a6f1-3bc0627456fd.png"><br>

## AUTO-AVALIAÇÕES
### Itens TP3
- O aluno não cometeu plágio?<br> 
  R: ✅ SIM! O próprio tema garante unicidade. Códigos de apoio do professor foram utilizados.
- O aluno desenvolveu mecanismos para autenticar, por login e senha, os usuários em sua aplicação?<br>
  R: ✅ SIM! Basta criar o usuário e verificar!
- O aluno desenvolveu mecanismos para autorizar e filtrar o acesso dos usuários à sua aplicação?<br>
  R: ✅ SIM! Somente a pagina de login e criação de usuário estão liberadas para não logados.
- O aluno utilizou a API de Persistência Java para anotar classes como entidades?<br>
  R: ✅ SIM! As classes Usuário, Audio e CryptoArte estão mapeadas.
- O aluno mapeou relacionamentos entre entidades?<br>
  R: ✅ SIM! As classes Audio e CryptoArte estão mapeadas no relacionamento de herança.

### Itens Assessment
###### 1. Construir aplicativos Java utilizando JSP e Servlets
- A aplicação entregue implementa uma aplicação Web com processamento no servidor utilizando JSP?<br> 
  R: ✅ SIM! Esta aplicação Web utiliza o servidor tomcat e JSP.
- A aplicação entregue implementa servlets para a criação e para a consulta de dados utilizando os métodos GET e POST corretamente?<br> 
  R: ✅ SIM! Esta aplicação implementa controllers com métodos GET e POST para diversos modelos.
- A aplicação entregue utiliza JSP para trabalhar com dados dinâmicos entre o cliente e o servidor?<br> 
  R: ✅ SIM! A aplicação utiliza JSP.
- O aluno resolveu no prazo, com excelência e louvor os exercícios em sala de aula (presencial ou virtual), TPs e assessment desta competência?<br> 
  R: 🟡 DEPENDE! Apesar de todos os exercícios, TP e assessment foram entregues com excelência, nem todos foram no prazo.

###### 2. Desenvolver aplicações Java Web utilizando arquitetura MVC com gerenciamento de estado
- As classes da aplicação entregue estão separadas em pacotes diferentes por responsabilidade, em camadas de modelo, controle e visão?<br> 
  R: ✅ SIM! A aplicação foi divida com pacotes separados de Repository, Service, Controller e Model, sendo esse com Domain, Test e Exceptions herdados do AT passado.
- A aplicação entregue possui um Spring Web MVC configurado corretamente e utiliza pelo menos três controladores Spring Web MVC corretamente?<br> 
  R: ✅ SIM! Todos os controllers foram configurados corretamente.
- A aplicação entregue implementa mecanismos de controle de acesso para autenticar, autorizar e filtrar o acesso dos usuários à aplicação?<br> 
  R: ✅ SIM! Apenas duas páginas estão disponíveis para não logados. Foi implementada uma feature de recuperação de senha também.
- O aluno resolveu no prazo, com excelência e louvor os exercícios em sala de aula (presencial ou virtual), TPs e assessment desta competência?<br> 
  R: 🟡 DEPENDE! Apesar de todos os exercícios, TP e assessment foram entregues com excelência, nem todos foram no prazo.

###### 3. Desenvolver aplicações com Java Persistence API e o framework Hibernate
- A Aplicação entregue utiliza a API de Persistência Java para anotar classes como entidades?<br> 
  R: ✅ SIM! Todas as classes de Domain foram mapeadas.
- A Aplicação mapeia relacionamentos entre entidades usando Hibernate, de modo coerente com seu domínio e documentado conforme solicitado no enunciado?<br> 
  R: ✅ SIM! Classes possuem relacionamentos e heranças mapeados.
- A aplicação implementa corretamente um CRUD em back-end (Criação, Recuperação, Atualização e Exclusão de Dados) usando Hibernate para pelo menos três classes do domínio?<br> 
  R: 🌀 WIP A aplicação possui o CRUD completo em seus 3 modelos de crypto arte, sendo eles Audio, Imagem e Video.
- O aluno resolveu no prazo, com excelência e louvor os exercícios em sala de aula (presencial ou virtual), TPs e assessment desta competência?<br> 
  R: 🟡 DEPENDE! Apesar de todos os exercícios, TP e assessment foram entregues com excelência, nem todos foram no prazo.

###### 4. Desenvolver APIs Java com serviços web seguindo a arquitetura REST
- A aplicação mapeia pelo menos um serviço web POST com arquitetura REST, permitindo que outras aplicações escrevam dados nela?<br> 
  R: ✅ SIM! Ele está no controller RestApiAudioController, no método salvar.
- A aplicação mapeia pelo menos um serviço web GET com arquitetura REST, permitindo que outras aplicações leiam dados dela?<br> 
  R: ✅ SIM! Ele está no controller RestApiAudioController, no método listar.
- Conforme o enunciado, foi entregue uma aplicação auxiliar RESTful que lê e grava dados na aplicação principal entregue no assessment? Também foi entregue uma documentação explicativa para outros desenvolvedores poderem criar aplicações que consumam a API?<br> 
  R: ✅ SIM! O link da aplicação, assim como a documentação, estão acima desse post.
- O aluno resolveu no prazo, com excelência e louvor os exercícios em sala de aula (presencial ou virtual), TPs e assessment desta competência?<br> 
  R: 🟡 DEPENDE! Apesar de todos os exercícios, TP e assessment foram entregues com excelência, nem todos foram no prazo.

### Itens Roteiro
###### Loader
- 1 Apague o seu banco de dados. ✅
- 2 Rode a aplicação e veja se as tabelas foram criadas (uma para cada classe e a de relacionamento). 🌀
- 3 Observe se em cada tabela tem pelo menos um registro. 🌀
###### Acesso do usuário
- 4 Tente acessar o sistema com uma credencial (email/senha) inexistente. ✅
- 5 A mensagem de usuário inválido deve ser apresentada. ✅
- 6 Verifique se os menus de cadastros não aparecem sem um usuário logado. ✅
- 7 Acesse o sistema e cadastre um novo usuário pelo link de signup. ✅
- 8 Tente acessar o sistema com as credenciais do usuário admin. ✅
- 9 Clique no menu de usuários para listar todos os registros existentes no banco. ✅
- 10 A tela home deve ser apresentada com o nome do usuário utilizado nas credenciais de login. ✅
- 11 A listagem de usuários deve estar organizada alfabeticamente de forma crescente através do nome. 🌀
###### Leilão: Cliente e CryptoArte
- 12 Clique no menu de leilões para listar todos os registros existentes no banco. ✅
- 13 Verifique se além dos dados cadastrais também está sendo exibida a informação do solicitante deste pedido e da quantidade de produtos.
- 14 Clique no menu de solicitantes para listar todos os registros existentes no banco. ✅
- 15 Faça a inclusão de um solicitante e verifique se existe algum critério de ordenação.
- 16 Clique no menu de bebidas para listar todos os registros existentes no banco. ✅
- 17 Faça a inclusão de uma bebida e verifique se existe algum critério de ordenação.
- 18 Clique no menu de comidas para listar todos os registros existentes no banco. ✅
- 19 Faça a inclusão de uma comida e verifique se existe algum critério de ordenação.
- 20 Clique no menu de sobremesas para listar todos os registros existentes no banco. ✅
- 21 Faça a inclusão de uma sobremesa e verifique se existe algum critério de ordenação.
- 22 Clique no menu de produtos para listar todos os registros existentes no banco de forma ordenada.
###### Leilões
- 23 Crie um novo pedido com o solicitante e os três produtos cadastrados.
- 24 Verifique no campo "select" se todos os solicitantes cadastrados aparecem ordenados.
- 25 Verifique no campo "checkbox" se todos os produtos cadastrados aparecem ordenados.
- 26 Após a inclusão verifique se os pedidos aparecem de forma ordenada.
###### Usuário
- 27 Faça o logout no sistema e entre com o novo usuário. ✅
- 28 Clique no menu de usuários para listar todos e confirme se a opção de exclusão está invisível. ✅
- 29 Verifique se os dois usuários cadastrados têm algum critério de ordenação.
###### Pedido de novo usuário
- 30 Clique no menu de pedidos para cadastrar um novo registro. ✅
- 31 Verifique se existe uma indicação de ausência de solicitantes e de produtos.
- 32 Faça a inclusão de um solicitante e verifique se aparece apenas um registro na lista.
- 33 Faça a inclusão de uma bebida, de uma comida e de uma sobremesa e verifique se aparece apenas um registro em cada listagem.
- 34 Verifique se aparecem apenas três registros na lista de produto de forma ordenada.
- 35 Clique no menu de pedidos e realize o cadastro de um novo registro.
- 36 Vá ao menu de usuário para confirmar a quantidade de solicitantes, produtos e pedidos por usuário.
###### Exclusão
- 37 Faça o cadastramento de um novo usuário e acesse com as credenciais desse usuário. ✅
- 38 Faça a inclusão de uma bebida, uma comida, uma sobremesa, um solicitante e de um pedido
- 39 Faça a exclusão de algum pedido e veja se a listagem foi atualizada, além da listagem de usuários.
- 40 Faça a exclusão desta bebida e veja se a listagem foi atualizada, além da listagem de produtos e de usuários. ✅
- 41 Faça a exclusão desta comida e veja se a listagem foi atualizada, além da listagem de produtos e de usuários. ✅
- 42 Faça a exclusão desta sobremesa e veja se a listagem foi atualizada, além da listagem de produtos e de usuários. ✅
- 43 Faça a exclusão deste solicitante e veja se a listagem foi atualizada, além da listagem de usuários. ✅
###### Integridade
- 44 Tente fazer a exclusão de um solicitante que esteja associado a um pedido. Não deve permitir e emitir uma mensagem.
- 45 Tente fazer a exclusão de uma bebida que esteja associada a um pedido. Não deve permitir e emitir uma mensagem.
- 46 Tente fazer a exclusão de uma comida que esteja associada a um pedido. Não deve permitir e emitir uma mensagem.
- 47 Tente fazer a exclusão de uma sobremesa que esteja associada a um pedido. Não deve permitir e emitir uma mensagem.
- 48 Agora tente excluir algum registro - através do menu de produtos - que esteja associado a um pedido. Mesma regra.
###### Fim
- 49 Vá ao menu de usuário e exclua um registro e verifique no banco se todos os registros associados foram excluídos.
- 50 Faça o logout no sistema, confirme se os menus sumiram e tente entrar com o usuário excluído.

