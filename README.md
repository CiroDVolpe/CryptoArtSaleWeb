# CryptoArtSaleWeb - Ciro Della Volpe
Projeto incremental para a disciplina de Desenvolvimento Web com Java 💻 ☕

- Para executar o projeto, execute o arquivo CryptoartsalewebApplication.java
- O banco irá ser auto-criado, então não precisa se preocupar.
- O banco iniciará limpo, porém é adicionado de maneira incremental, logo criar um usuário já funcionará para diversos testes.

### Documentação Rest

### Link para aplicação REST que consome essa

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
