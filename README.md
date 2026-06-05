# filmes-spring-boot
Aplicação web

# 🎬 Sistema de Avaliação de Filmes

Projeto desenvolvido em Java com Spring Boot para gerenciamento de filmes e análises de usuários.

## 📋 Descrição

O sistema permite cadastrar filmes, visualizar detalhes, adicionar análises e realizar operações de edição e exclusão. Além disso, disponibiliza uma API REST para integração com outras aplicações.

O projeto foi desenvolvido como atividade prática do curso Técnico em Desenvolvimento de Sistemas.

## 🚀 Funcionalidades

### Sistema Web

* Cadastro de filmes
* Listagem de filmes
* Visualização de detalhes
* Cadastro de análises
* Edição de filmes
* Exclusão de filmes
* Tema claro e escuro (Dark Mode) utilizando cookies

### API REST

* GET - Listar filmes
* GET - Buscar filme por ID
* POST - Cadastrar filme
* PUT - Atualizar filme
* DELETE - Excluir filme

## 🛠️ Tecnologias Utilizadas

* Java 17
* Spring Boot 3
* Spring Data JPA
* Hibernate
* Thymeleaf
* MySQL
* Maven
* jQuery
* HTML5
* CSS3

## 🗄️ Banco de Dados

Criação do banco:

```sql
CREATE DATABASE cinema;
```

Configuração utilizada:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cinema
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/filipeguerreiro25-boop/filmes-spring-boot.git
```

2. Crie o banco de dados MySQL:

```sql
CREATE DATABASE cinema;
```

3. Configure usuário e senha do MySQL no arquivo:

```text
src/main/resources/application.properties
```

4. Execute o projeto:

```bash
mvn spring-boot:run
```

Ou execute diretamente pelo NetBeans.

## 📁 Estrutura do Projeto

```text
src
├── main
│   ├── java
│   │   ├── controller
│   │   ├── model
│   │   └── repository
│   └── resources
│       ├── static
│       │   └── js
│       └── templates
```

## 📚 Aprendizados

Durante o desenvolvimento deste projeto foram praticados conceitos de:

* Programação Orientada a Objetos
* Spring Boot
* Persistência de dados com JPA/Hibernate
* MySQL
* APIs REST
* AJAX com jQuery
* Thymeleaf
* Git e GitHub

## 👨‍💻 Autor

**Filipe Guerreiro**

LinkedIn:
https://www.linkedin.com/in/filipe-guerreiro-987a14251

GitHub:
https://github.com/filipeguerreiro25-boop
