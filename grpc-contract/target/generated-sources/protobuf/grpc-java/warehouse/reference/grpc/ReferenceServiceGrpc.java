package warehouse.reference.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.2)",
    comments = "Source: reference.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReferenceServiceGrpc {

  private ReferenceServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "warehouse.reference.ReferenceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<warehouse.reference.grpc.ValidateProductRequest,
      warehouse.reference.grpc.ValidateProductResponse> getValidateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateProduct",
      requestType = warehouse.reference.grpc.ValidateProductRequest.class,
      responseType = warehouse.reference.grpc.ValidateProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<warehouse.reference.grpc.ValidateProductRequest,
      warehouse.reference.grpc.ValidateProductResponse> getValidateProductMethod() {
    io.grpc.MethodDescriptor<warehouse.reference.grpc.ValidateProductRequest, warehouse.reference.grpc.ValidateProductResponse> getValidateProductMethod;
    if ((getValidateProductMethod = ReferenceServiceGrpc.getValidateProductMethod) == null) {
      synchronized (ReferenceServiceGrpc.class) {
        if ((getValidateProductMethod = ReferenceServiceGrpc.getValidateProductMethod) == null) {
          ReferenceServiceGrpc.getValidateProductMethod = getValidateProductMethod =
              io.grpc.MethodDescriptor.<warehouse.reference.grpc.ValidateProductRequest, warehouse.reference.grpc.ValidateProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse.reference.grpc.ValidateProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse.reference.grpc.ValidateProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReferenceServiceMethodDescriptorSupplier("ValidateProduct"))
              .build();
        }
      }
    }
    return getValidateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<warehouse.reference.grpc.CanStoreTogetherRequest,
      warehouse.reference.grpc.CanStoreTogetherResponse> getCanStoreTogetherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CanStoreTogether",
      requestType = warehouse.reference.grpc.CanStoreTogetherRequest.class,
      responseType = warehouse.reference.grpc.CanStoreTogetherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<warehouse.reference.grpc.CanStoreTogetherRequest,
      warehouse.reference.grpc.CanStoreTogetherResponse> getCanStoreTogetherMethod() {
    io.grpc.MethodDescriptor<warehouse.reference.grpc.CanStoreTogetherRequest, warehouse.reference.grpc.CanStoreTogetherResponse> getCanStoreTogetherMethod;
    if ((getCanStoreTogetherMethod = ReferenceServiceGrpc.getCanStoreTogetherMethod) == null) {
      synchronized (ReferenceServiceGrpc.class) {
        if ((getCanStoreTogetherMethod = ReferenceServiceGrpc.getCanStoreTogetherMethod) == null) {
          ReferenceServiceGrpc.getCanStoreTogetherMethod = getCanStoreTogetherMethod =
              io.grpc.MethodDescriptor.<warehouse.reference.grpc.CanStoreTogetherRequest, warehouse.reference.grpc.CanStoreTogetherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CanStoreTogether"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse.reference.grpc.CanStoreTogetherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse.reference.grpc.CanStoreTogetherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReferenceServiceMethodDescriptorSupplier("CanStoreTogether"))
              .build();
        }
      }
    }
    return getCanStoreTogetherMethod;
  }

  private static volatile io.grpc.MethodDescriptor<warehouse.reference.grpc.ListCategoriesRequest,
      warehouse.reference.grpc.ListCategoriesResponse> getListCategoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCategories",
      requestType = warehouse.reference.grpc.ListCategoriesRequest.class,
      responseType = warehouse.reference.grpc.ListCategoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<warehouse.reference.grpc.ListCategoriesRequest,
      warehouse.reference.grpc.ListCategoriesResponse> getListCategoriesMethod() {
    io.grpc.MethodDescriptor<warehouse.reference.grpc.ListCategoriesRequest, warehouse.reference.grpc.ListCategoriesResponse> getListCategoriesMethod;
    if ((getListCategoriesMethod = ReferenceServiceGrpc.getListCategoriesMethod) == null) {
      synchronized (ReferenceServiceGrpc.class) {
        if ((getListCategoriesMethod = ReferenceServiceGrpc.getListCategoriesMethod) == null) {
          ReferenceServiceGrpc.getListCategoriesMethod = getListCategoriesMethod =
              io.grpc.MethodDescriptor.<warehouse.reference.grpc.ListCategoriesRequest, warehouse.reference.grpc.ListCategoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCategories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse.reference.grpc.ListCategoriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse.reference.grpc.ListCategoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReferenceServiceMethodDescriptorSupplier("ListCategories"))
              .build();
        }
      }
    }
    return getListCategoriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<warehouse.reference.grpc.NeighborhoodRadiusRequest,
      warehouse.reference.grpc.NeighborhoodRadiusResponse> getGetNeighborhoodRadiusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNeighborhoodRadius",
      requestType = warehouse.reference.grpc.NeighborhoodRadiusRequest.class,
      responseType = warehouse.reference.grpc.NeighborhoodRadiusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<warehouse.reference.grpc.NeighborhoodRadiusRequest,
      warehouse.reference.grpc.NeighborhoodRadiusResponse> getGetNeighborhoodRadiusMethod() {
    io.grpc.MethodDescriptor<warehouse.reference.grpc.NeighborhoodRadiusRequest, warehouse.reference.grpc.NeighborhoodRadiusResponse> getGetNeighborhoodRadiusMethod;
    if ((getGetNeighborhoodRadiusMethod = ReferenceServiceGrpc.getGetNeighborhoodRadiusMethod) == null) {
      synchronized (ReferenceServiceGrpc.class) {
        if ((getGetNeighborhoodRadiusMethod = ReferenceServiceGrpc.getGetNeighborhoodRadiusMethod) == null) {
          ReferenceServiceGrpc.getGetNeighborhoodRadiusMethod = getGetNeighborhoodRadiusMethod =
              io.grpc.MethodDescriptor.<warehouse.reference.grpc.NeighborhoodRadiusRequest, warehouse.reference.grpc.NeighborhoodRadiusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNeighborhoodRadius"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse.reference.grpc.NeighborhoodRadiusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse.reference.grpc.NeighborhoodRadiusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReferenceServiceMethodDescriptorSupplier("GetNeighborhoodRadius"))
              .build();
        }
      }
    }
    return getGetNeighborhoodRadiusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReferenceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReferenceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReferenceServiceStub>() {
        @java.lang.Override
        public ReferenceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReferenceServiceStub(channel, callOptions);
        }
      };
    return ReferenceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReferenceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReferenceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReferenceServiceBlockingStub>() {
        @java.lang.Override
        public ReferenceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReferenceServiceBlockingStub(channel, callOptions);
        }
      };
    return ReferenceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReferenceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReferenceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReferenceServiceFutureStub>() {
        @java.lang.Override
        public ReferenceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReferenceServiceFutureStub(channel, callOptions);
        }
      };
    return ReferenceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void validateProduct(warehouse.reference.grpc.ValidateProductRequest request,
        io.grpc.stub.StreamObserver<warehouse.reference.grpc.ValidateProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateProductMethod(), responseObserver);
    }

    /**
     */
    default void canStoreTogether(warehouse.reference.grpc.CanStoreTogetherRequest request,
        io.grpc.stub.StreamObserver<warehouse.reference.grpc.CanStoreTogetherResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCanStoreTogetherMethod(), responseObserver);
    }

    /**
     */
    default void listCategories(warehouse.reference.grpc.ListCategoriesRequest request,
        io.grpc.stub.StreamObserver<warehouse.reference.grpc.ListCategoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCategoriesMethod(), responseObserver);
    }

    /**
     */
    default void getNeighborhoodRadius(warehouse.reference.grpc.NeighborhoodRadiusRequest request,
        io.grpc.stub.StreamObserver<warehouse.reference.grpc.NeighborhoodRadiusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNeighborhoodRadiusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ReferenceService.
   */
  public static abstract class ReferenceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ReferenceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ReferenceService.
   */
  public static final class ReferenceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ReferenceServiceStub> {
    private ReferenceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReferenceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReferenceServiceStub(channel, callOptions);
    }

    /**
     */
    public void validateProduct(warehouse.reference.grpc.ValidateProductRequest request,
        io.grpc.stub.StreamObserver<warehouse.reference.grpc.ValidateProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void canStoreTogether(warehouse.reference.grpc.CanStoreTogetherRequest request,
        io.grpc.stub.StreamObserver<warehouse.reference.grpc.CanStoreTogetherResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCanStoreTogetherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCategories(warehouse.reference.grpc.ListCategoriesRequest request,
        io.grpc.stub.StreamObserver<warehouse.reference.grpc.ListCategoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCategoriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNeighborhoodRadius(warehouse.reference.grpc.NeighborhoodRadiusRequest request,
        io.grpc.stub.StreamObserver<warehouse.reference.grpc.NeighborhoodRadiusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNeighborhoodRadiusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ReferenceService.
   */
  public static final class ReferenceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ReferenceServiceBlockingStub> {
    private ReferenceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReferenceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReferenceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public warehouse.reference.grpc.ValidateProductResponse validateProduct(warehouse.reference.grpc.ValidateProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public warehouse.reference.grpc.CanStoreTogetherResponse canStoreTogether(warehouse.reference.grpc.CanStoreTogetherRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCanStoreTogetherMethod(), getCallOptions(), request);
    }

    /**
     */
    public warehouse.reference.grpc.ListCategoriesResponse listCategories(warehouse.reference.grpc.ListCategoriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCategoriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public warehouse.reference.grpc.NeighborhoodRadiusResponse getNeighborhoodRadius(warehouse.reference.grpc.NeighborhoodRadiusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNeighborhoodRadiusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ReferenceService.
   */
  public static final class ReferenceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ReferenceServiceFutureStub> {
    private ReferenceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReferenceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReferenceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<warehouse.reference.grpc.ValidateProductResponse> validateProduct(
        warehouse.reference.grpc.ValidateProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<warehouse.reference.grpc.CanStoreTogetherResponse> canStoreTogether(
        warehouse.reference.grpc.CanStoreTogetherRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCanStoreTogetherMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<warehouse.reference.grpc.ListCategoriesResponse> listCategories(
        warehouse.reference.grpc.ListCategoriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCategoriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<warehouse.reference.grpc.NeighborhoodRadiusResponse> getNeighborhoodRadius(
        warehouse.reference.grpc.NeighborhoodRadiusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNeighborhoodRadiusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATE_PRODUCT = 0;
  private static final int METHODID_CAN_STORE_TOGETHER = 1;
  private static final int METHODID_LIST_CATEGORIES = 2;
  private static final int METHODID_GET_NEIGHBORHOOD_RADIUS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VALIDATE_PRODUCT:
          serviceImpl.validateProduct((warehouse.reference.grpc.ValidateProductRequest) request,
              (io.grpc.stub.StreamObserver<warehouse.reference.grpc.ValidateProductResponse>) responseObserver);
          break;
        case METHODID_CAN_STORE_TOGETHER:
          serviceImpl.canStoreTogether((warehouse.reference.grpc.CanStoreTogetherRequest) request,
              (io.grpc.stub.StreamObserver<warehouse.reference.grpc.CanStoreTogetherResponse>) responseObserver);
          break;
        case METHODID_LIST_CATEGORIES:
          serviceImpl.listCategories((warehouse.reference.grpc.ListCategoriesRequest) request,
              (io.grpc.stub.StreamObserver<warehouse.reference.grpc.ListCategoriesResponse>) responseObserver);
          break;
        case METHODID_GET_NEIGHBORHOOD_RADIUS:
          serviceImpl.getNeighborhoodRadius((warehouse.reference.grpc.NeighborhoodRadiusRequest) request,
              (io.grpc.stub.StreamObserver<warehouse.reference.grpc.NeighborhoodRadiusResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getValidateProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              warehouse.reference.grpc.ValidateProductRequest,
              warehouse.reference.grpc.ValidateProductResponse>(
                service, METHODID_VALIDATE_PRODUCT)))
        .addMethod(
          getCanStoreTogetherMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              warehouse.reference.grpc.CanStoreTogetherRequest,
              warehouse.reference.grpc.CanStoreTogetherResponse>(
                service, METHODID_CAN_STORE_TOGETHER)))
        .addMethod(
          getListCategoriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              warehouse.reference.grpc.ListCategoriesRequest,
              warehouse.reference.grpc.ListCategoriesResponse>(
                service, METHODID_LIST_CATEGORIES)))
        .addMethod(
          getGetNeighborhoodRadiusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              warehouse.reference.grpc.NeighborhoodRadiusRequest,
              warehouse.reference.grpc.NeighborhoodRadiusResponse>(
                service, METHODID_GET_NEIGHBORHOOD_RADIUS)))
        .build();
  }

  private static abstract class ReferenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReferenceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return warehouse.reference.grpc.Reference.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReferenceService");
    }
  }

  private static final class ReferenceServiceFileDescriptorSupplier
      extends ReferenceServiceBaseDescriptorSupplier {
    ReferenceServiceFileDescriptorSupplier() {}
  }

  private static final class ReferenceServiceMethodDescriptorSupplier
      extends ReferenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ReferenceServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ReferenceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReferenceServiceFileDescriptorSupplier())
              .addMethod(getValidateProductMethod())
              .addMethod(getCanStoreTogetherMethod())
              .addMethod(getListCategoriesMethod())
              .addMethod(getGetNeighborhoodRadiusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
