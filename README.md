Calculadora gRPC em Java
Este projeto implementa um serviço de calculadora utilizando gRPC em Java. O serviço oferece uma operação de soma, onde o cliente pode enviar dois números inteiros e receber o resultado da soma.
Estrutura do Projeto
protos/calculadora.proto: Define as mensagens e o serviço gRPC.
src/main/java/gRPC/calculadora/server/CalculadoraServer.java: Implementa o servidor gRPC que processa as requisições.
src/main/java/gRPC/calculadora/server/CalculadoraServiceImpl.java: Implementa a lógica do serviço de cálculo.
src/main/java/gRPC/calculadora/client/CalculadoraClient.java: Implementa o cliente gRPC que se comunica com o servidor.
