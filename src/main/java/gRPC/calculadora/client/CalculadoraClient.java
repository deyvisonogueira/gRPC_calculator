package gRPC.calculadora.client;

import java.util.Scanner;
import java.util.logging.Logger;

import com.proto.calculadora.CalculadoraServiceGrpc;
import com.proto.calculadora.SomaRequest;
import com.proto.calculadora.SomaResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalculadoraClient {
	private static Logger LOG = Logger.getLogger("Logger");

    public static void main(String[] args) {
        CalculadoraClient main = new CalculadoraClient();
        main.run();
    }

    private void run() {
        LOG.info("gRPC client");

        //prepara o canal para trafegar as informacoes
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        //chama a funcao somar
        somar(channel);

        //fecha o canal
        LOG.info("Fechando o canal...");
        channel.shutdown();
    }

    private void somar(final ManagedChannel channel) {
        //prepara stub para chamada dos serviços
        CalculadoraServiceGrpc.CalculadoraServiceBlockingStub calcClient =  CalculadoraServiceGrpc.newBlockingStub(channel);

        //obtencao dos valores para a soma
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero: ");
        int n1 = scanner.nextInt();
        System.out.println("digite o segundo numero: ");
        int n2 = scanner.nextInt();

        //monta objeto de requisicao para o servico processa
        SomaRequest somaRequest = SomaRequest.newBuilder()
                .setNumero1(n1)
                .setNumero2(n2)
                .build();

        //invoca o metodo rpc somar
        SomaResponse somaResponse = calcClient.somar(somaRequest);

        //exibe o resultado
        LOG.info("Resultado: " + somaResponse.getResultado());
    }
}
