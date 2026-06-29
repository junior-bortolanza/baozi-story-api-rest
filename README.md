# 🥟 Baozi Store API

API REST desenvolvida com **Java** e **Spring Boot** para o gerenciamento de clientes, produtos e pedidos de uma pequena loja fictícia chamada **Baozi Store**.

Este projeto foi desenvolvido como atividade prática da disciplina **Desenvolvimento Web Back-End**, aplicando conceitos de APIs REST, arquitetura MVC, persistência de dados com Spring Data JPA e banco de dados MySQL.

---

## 📖 Sobre o Projeto

A **Baozi Store** é uma pequena loja especializada na venda de pãozinhos chineses (*Baozi*).

Com o objetivo de informatizar o controle do negócio, foi desenvolvida uma API REST capaz de realizar o gerenciamento de:

* 👤 Clientes
* 🥟 Produtos
* 📦 Pedidos

Cada pedido relaciona um cliente a um produto, registrando também a quantidade adquirida.

---

## 🏗 Arquitetura

O projeto foi organizado seguindo a arquitetura em camadas (Layered Architecture), utilizando o padrão MVC do Spring Boot.

```text
src
└── main
    └── java
        ├── controller
        ├── service
        ├── repository
        ├── model
        └── BaoziStoreApplication
```

### Responsabilidade de cada camada

| Pacote         | Responsabilidade                                                              |
| -------------- | ----------------------------------------------------------------------------- |
| **controller** | Recebe as requisições HTTP e expõe os endpoints da API.                       |
| **service**    | Implementa as regras de negócio da aplicação.                                 |
| **repository** | Responsável pela comunicação com o banco de dados utilizando Spring Data JPA. |
| **model**      | Contém as entidades JPA e seus relacionamentos.                               |

---

## 📚 Modelo de Dados

### Cliente

| Campo        | Tipo      |
| ------------ | --------- |
| id           | Long      |
| nome         | String    |
| clienteDesde | LocalDate |

---

### Produto

| Campo   | Tipo       |
| ------- | ---------- |
| id      | Long       |
| nome    | String     |
| preco   | BigDecimal |
| estoque | Boolean    |

---

### Pedido

| Campo      | Tipo    |
| ---------- | ------- |
| id         | Long    |
| cliente    | Cliente |
| produto    | Produto |
| quantidade | Integer |

### Relacionamentos

* Um **Cliente** pode realizar diversos **Pedidos**.
* Um **Produto** pode estar presente em diversos **Pedidos**.
* Cada **Pedido** pertence a um único **Cliente** e a um único **Produto**.

---

## 🚀 Funcionalidades

### Cliente

* ✅ Cadastrar cliente
* ✅ Buscar cliente por ID
* ✅ Listar clientes
* ✅ Atualizar cliente
* ✅ Excluir cliente

### Produto

* ✅ Cadastrar produto
* ✅ Buscar produto por ID
* ✅ Listar produtos
* ✅ Atualizar produto
* ✅ Excluir produto

### Pedido

* ✅ Registrar pedido
* ✅ Buscar pedido por ID
* ✅ Listar pedidos
* ✅ Atualizar pedido
* ✅ Excluir pedido

---

## 📡 Endpoints

### Clientes

| Método | Endpoint         |
| ------ | ---------------- |
| POST   | `/clientes`      |
| GET    | `/clientes`      |
| GET    | `/clientes/{id}` |
| PUT    | `/clientes/{id}` |
| DELETE | `/clientes/{id}` |

### Produtos

| Método | Endpoint         |
| ------ | ---------------- |
| POST   | `/produtos`      |
| GET    | `/produtos`      |
| GET    | `/produtos/{id}` |
| PUT    | `/produtos/{id}` |
| DELETE | `/produtos/{id}` |

### Pedidos

| Método | Endpoint        |
| ------ | --------------- |
| POST   | `/pedidos`      |
| GET    | `/pedidos`      |
| GET    | `/pedidos/{id}` |
| PUT    | `/pedidos/{id}` |
| DELETE | `/pedidos/{id}` |

---

## 🛠 Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Postman

---

## ▶️ Como Executar o Projeto

### 1. Clone o repositório

```bash
git clone https://github.com/junior-bortolanza/baozi-store.git
```

### 2. Configure o banco de dados

No arquivo `application.properties` configure:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/baozi_store?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
```

### 3. Execute a aplicação

Utilizando Maven:

```bash
./mvnw spring-boot:run
```

Ou execute a classe:

```text
BaoziStoreApplication
```

---

## 🧪 Testes

Todos os endpoints foram testados utilizando o **Postman**, validando as operações de:

* Cadastro
* Consulta por ID
* Listagem
* Atualização
* Exclusão

---

## 🎯 Objetivos de Aprendizagem

Durante o desenvolvimento deste projeto foram aplicados conceitos de:

* APIs REST
* Spring Boot
* Spring Data JPA
* Hibernate
* Persistência em banco de dados relacional
* Relacionamentos entre entidades
* Arquitetura MVC
* CRUD completo
* Testes de API com Postman

---

## 👨‍💻 Autor

**Junior Bortolanza**

* 💼 LinkedIn: https://linkedin.com/in/juniorbortolanza
* 💻 GitHub: https://github.com/junior-bortolanza

---

⭐ Projeto desenvolvido para fins acadêmicos na disciplina de **Desenvolvimento Web Back-End** utilizando Java e Spring Boot.
