package com.proto.calculadora;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.32.2)",
    comments = "Source: calculadora.proto")
public final class CalculadoraServiceGrpc {

  private CalculadoraServiceGrpc() {}

  public static final String SERVICE_NAME = "calculadora.CalculadoraService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calculadora.SomaRequest,
      com.proto.calculadora.SomaResponse> getSomarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "somar",
      requestType = com.proto.calculadora.SomaRequest.class,
      responseType = com.proto.calculadora.SomaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculadora.SomaRequest,
      com.proto.calculadora.SomaResponse> getSomarMethod() {
    io.grpc.MethodDescriptor<com.proto.calculadora.SomaRequest, com.proto.calculadora.SomaResponse> getSomarMethod;
    if ((getSomarMethod = CalculadoraServiceGrpc.getSomarMethod) == null) {
      synchronized (CalculadoraServiceGrpc.class) {
        if ((getSomarMethod = CalculadoraServiceGrpc.getSomarMethod) == null) {
          CalculadoraServiceGrpc.getSomarMethod = getSomarMethod =
              io.grpc.MethodDescriptor.<com.proto.calculadora.SomaRequest, com.proto.calculadora.SomaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "somar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculadora.SomaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculadora.SomaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculadoraServiceMethodDescriptorSupplier("somar"))
              .build();
        }
      }
    }
    return getSomarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculadoraServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculadoraServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculadoraServiceStub>() {
        @java.lang.Override
        public CalculadoraServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculadoraServiceStub(channel, callOptions);
        }
      };
    return CalculadoraServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculadoraServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculadoraServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculadoraServiceBlockingStub>() {
        @java.lang.Override
        public CalculadoraServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculadoraServiceBlockingStub(channel, callOptions);
        }
      };
    return CalculadoraServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculadoraServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculadoraServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculadoraServiceFutureStub>() {
        @java.lang.Override
        public CalculadoraServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculadoraServiceFutureStub(channel, callOptions);
        }
      };
    return CalculadoraServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CalculadoraServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void somar(com.proto.calculadora.SomaRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculadora.SomaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSomarMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSomarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculadora.SomaRequest,
                com.proto.calculadora.SomaResponse>(
                  this, METHODID_SOMAR)))
          .build();
    }
  }

  /**
   */
  public static final class CalculadoraServiceStub extends io.grpc.stub.AbstractAsyncStub<CalculadoraServiceStub> {
    private CalculadoraServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculadoraServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculadoraServiceStub(channel, callOptions);
    }

    /**
     */
    public void somar(com.proto.calculadora.SomaRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculadora.SomaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSomarMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculadoraServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalculadoraServiceBlockingStub> {
    private CalculadoraServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculadoraServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculadoraServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.calculadora.SomaResponse somar(com.proto.calculadora.SomaRequest request) {
      return blockingUnaryCall(
          getChannel(), getSomarMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculadoraServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CalculadoraServiceFutureStub> {
    private CalculadoraServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculadoraServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculadoraServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculadora.SomaResponse> somar(
        com.proto.calculadora.SomaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSomarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SOMAR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculadoraServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculadoraServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SOMAR:
          serviceImpl.somar((com.proto.calculadora.SomaRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculadora.SomaResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculadoraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculadoraServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calculadora.Calculadora.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculadoraService");
    }
  }

  private static final class CalculadoraServiceFileDescriptorSupplier
      extends CalculadoraServiceBaseDescriptorSupplier {
    CalculadoraServiceFileDescriptorSupplier() {}
  }

  private static final class CalculadoraServiceMethodDescriptorSupplier
      extends CalculadoraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculadoraServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalculadoraServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculadoraServiceFileDescriptorSupplier())
              .addMethod(getSomarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
