<h1 align="center">
    TODO List
</h1>

API para gerenciar tarefas (CRUD) que faz parte  [desse desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) para pessoas desenvolvedoras backend júnior, que se candidatam para a  Simplify

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [MySQL](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring JPA
- Tratamento de respostas de erros

## Como Executar

- Clonar repositório
- Construir o projeto :
```
$ ./mvnw clean package
```
- Execultar a aplicação :
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```
A API poderá ser acessada em [localhost:8080](http://localhost:8080).