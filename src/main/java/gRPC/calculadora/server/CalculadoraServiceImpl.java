package gRPC.calculadora.server;

import com.proto.calculadora.SomaRequest;
import com.proto.calculadora.SomaResponse;
import com.proto.calculadora.*;

import io.grpc.stub.StreamObserver;

public class CalculadoraServiceImpl extends CalculadoraServiceGrpc.CalculadoraServiceImplBase {
	
	@Override
    public void somar(SomaRequest request, StreamObserver<SomaResponse> responseObserver) {
        //recebe os dados enviados via grpc declarados no proto
        int numero1 = request.getNumero1();
        int numero2 = request.getNumero2();

        //executa regra de negocio
        int resultado = numero1 + numero2;

        //monta a resposta para o client
        SomaResponse response = SomaResponse.newBuilder().setResultado(resultado).build();

        //envia resposta para a requisicao grpc
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}