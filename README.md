
# Trabalho final do curso de java

O projeto consiste em uma API Rest para cadastro de usuários, utilizando da liguagem java com o framework Spring Boot para desenvolvimento do backend e utilização do aplicativo Postman para testar os endpoints.


## Técnologias utilizadas

- Java 17
- Spring Boot 3.0.6
- Spring Web
- Spring Data JPA
- Spring Boot DevTools
- Banco de Dados H2 (Banco de dados em memória)
- Lombok 


## Documentação da API

#### Retorna todos os usuários

```http
  GET /usuario
```

#### Retorna um usuário específico 

```http
  GET /usuario/{id}
```

#### Cadastra o usuário 

```http
  POST /usuario
```

#### Deleta o usuário 

```http
  DELETE /usuario/{id}
```


