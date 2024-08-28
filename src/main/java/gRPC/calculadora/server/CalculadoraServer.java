package gRPC.calculadora.server;

import java.io.IOException;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class CalculadoraServer {
	
	private static Logger LOG = Logger.getLogger("Logger");

	public static void main(String[] args) throws InterruptedException, IOException {
	    LOG.info("Iniciando servidor gRPC...");
	    Server server = ServerBuilder.forPort(50051)
	            .addService(new CalculadoraServiceImpl())
	            .build();
	    server.start();
	    LOG.info("Servidor iniciado!");

	    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
	        LOG.warning("O servidor recebeu uma solicitacao para encerrar!");
	        server.shutdown();
	        System.out.println("Servidor encerrado com sucesso!");
	    }));
	    server.awaitTermination();
	}

}
