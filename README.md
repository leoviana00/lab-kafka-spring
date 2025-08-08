<h1 align="center"> Apache Kfka | Spring Boot </h1>

<p align="center">
  <img alt="Springboot" src="https://img.shields.io/static/v1?label=Backend&message=Kafka&color=8257E5&labelColor=000000"  />
  <img alt="License" src="https://img.shields.io/static/v1?label=license&message=MIT&color=49AA26&labelColor=000000">
</p>

<p align="center">
  <a href="#projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#objetivos">Objetivos</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#arquitetura">Arquitetura</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#roadmap">Roadmap</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#referências">Referências</a>
</p>

<p align="center">
  <img alt="Kafka" src="./data/spring-kafka.png">
</p>


## Projeto

Escopo do Projeto:

- Integração com Spring Boot com o Apache Kafka. Exemplo prático.


## Tecnologias

- Java
- Springboot
- Docker
- Apache Kafka
- Zookeeper
- kafka-uiUI for Apache Kafka
- Insomnia


## Objetivos

- Entender um pouco sobre processamento assincrono de eventos através do Apache Kafka, criações de Tópicos, Brokers, subdivisão de eventos e armazenamento em filas. Criação de um produtor e dois consumidores, realizar integração com o Spring Boot.


## Arquitetura

- Diagrama arquitetural

<p align="center">
  <img alt="Rabbit" src="./data/springboot-kafka.svg">
</p>


## Roadmap

- [x] Requisitos
  - [x] Docker
  - [x] Docker Compose
  - [x] Java
  - [x] Maven

- [x] Levantar infraestrutura kafka via docker
  - [x] Broker
  - [x] Zookeeper
  - [x] Ui Kafka

- [x] Criar os serviços

  - [x] Criar um producer 
    - [x] Config 
      - x[] Producer Kafka
      - [x] Topic Kafka
    - [x] Record
      - [x] Order
    - [x] Service
      - [x] Order
    - [x] Controller
      - [x] Order

  - [x] Criar consumer 1
    - [x] Config 
      - [x] Consumer Kafka
      - [x] Topic Kafka
    - [x] Record
      - [x] Order
    - [x] Service
      - [x] Order

  - [x] Criar consumer 2
    - [x] Config 
      - [x] Consumer Kafka
      - [x] Topic Kafka
    - [x] Record
      - [x] Order
    - [x] Service
      - [x] Order

## Referências

