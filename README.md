# Calculadora gRPC em Java

Este projeto implementa um serviço de calculadora utilizando gRPC em Java. O serviço oferece uma operação de soma, onde o cliente pode enviar dois números inteiros e receber o resultado da soma.

## Estrutura do Projeto

- **protos/calculadora.proto**: Define as mensagens e o serviço gRPC.
- **src/main/java/gRPC/calculadora/server/CalculadoraServer.java**: Implementa o servidor gRPC que processa as requisições.
- **src/main/java/gRPC/calculadora/server/CalculadoraServiceImpl.java**: Implementa a lógica do serviço de cálculo.
- **src/main/java/gRPC/calculadora/client/CalculadoraClient.java**: Implementa o cliente gRPC que se comunica com o servidor.

## Pré-requisitos

- **Java 8 ou superior**: Certifique-se de ter o Java Development Kit (JDK) instalado.
- **gRPC**: As bibliotecas do gRPC devem estar configuradas no projeto.
- **Protocolo Buffer**: Instale o protoc para compilar os arquivos .proto.

## Como Executar

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git](https://github.com/deyvisonogueira/gRPC_calculator.git
   cd seu-repositorio
