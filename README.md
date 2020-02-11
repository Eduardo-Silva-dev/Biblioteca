# Biblioteca
Criar uma API REST para gerenciamento de uma loja que aluga livros. Através destes serviços a empresa poderá manter o cadastro dos livros, clientes, aluguéis e acompanhar em um dashboard o que está sendo devolvido e alugado em tempo real.

### Pré-requisitos

* Banco de Dados MySql,
* Xampp,
* Eclipse IDE, 
* Postman.

### Execução

* Importa o projeto no Eclipse
* Iniciar o Mysql no Xampp
* Na pasta "src/main/java" no pacote "com.biblioteca.apirest" execute a classe "ApirestApplication.java

OBS: Caso ocorra erro no Mysql ao executar a Api, será necessario executar o comando 'SET @@global.time_zone = '+3:00';' no Mysql Workbench.

## Executando os testes

Pelo Postman, poderá executar teste http, como:
* GET
* PUSH
* PUT
* DELETE

Na coluna "status" da classe livro, ela só podera receber 0, 1 ou 2, que siginifica:

* 0 - Disponivel
* 1 - Reservado
* 2 - Alugado

Na coluna "data" da classe livro, ela recebe a data do aluguel ou da reserva.

## Construído com

* [SPRING-BOOT] Versão: 2.2.4
* [MySQL] MySQL WORKBENCH 6.3 CE
* [MAVEN] Versão: 4.0.0
