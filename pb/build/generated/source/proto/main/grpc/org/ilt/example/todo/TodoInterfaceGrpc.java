package org.ilt.example.todo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: todo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TodoInterfaceGrpc {

  private TodoInterfaceGrpc() {}

  public static final String SERVICE_NAME = "org.ilt.example.todo.TodoInterface";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.ilt.example.todo.TodoRequest,
      org.ilt.example.todo.Summary> getIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Index",
      requestType = org.ilt.example.todo.TodoRequest.class,
      responseType = org.ilt.example.todo.Summary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.ilt.example.todo.TodoRequest,
      org.ilt.example.todo.Summary> getIndexMethod() {
    io.grpc.MethodDescriptor<org.ilt.example.todo.TodoRequest, org.ilt.example.todo.Summary> getIndexMethod;
    if ((getIndexMethod = TodoInterfaceGrpc.getIndexMethod) == null) {
      synchronized (TodoInterfaceGrpc.class) {
        if ((getIndexMethod = TodoInterfaceGrpc.getIndexMethod) == null) {
          TodoInterfaceGrpc.getIndexMethod = getIndexMethod =
              io.grpc.MethodDescriptor.<org.ilt.example.todo.TodoRequest, org.ilt.example.todo.Summary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Index"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ilt.example.todo.TodoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ilt.example.todo.Summary.getDefaultInstance()))
              .setSchemaDescriptor(new TodoInterfaceMethodDescriptorSupplier("Index"))
              .build();
        }
      }
    }
    return getIndexMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TodoInterfaceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TodoInterfaceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TodoInterfaceStub>() {
        @java.lang.Override
        public TodoInterfaceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TodoInterfaceStub(channel, callOptions);
        }
      };
    return TodoInterfaceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TodoInterfaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TodoInterfaceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TodoInterfaceBlockingStub>() {
        @java.lang.Override
        public TodoInterfaceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TodoInterfaceBlockingStub(channel, callOptions);
        }
      };
    return TodoInterfaceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TodoInterfaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TodoInterfaceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TodoInterfaceFutureStub>() {
        @java.lang.Override
        public TodoInterfaceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TodoInterfaceFutureStub(channel, callOptions);
        }
      };
    return TodoInterfaceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TodoInterfaceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<org.ilt.example.todo.TodoRequest> index(
        io.grpc.stub.StreamObserver<org.ilt.example.todo.Summary> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getIndexMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIndexMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.ilt.example.todo.TodoRequest,
                org.ilt.example.todo.Summary>(
                  this, METHODID_INDEX)))
          .build();
    }
  }

  /**
   */
  public static final class TodoInterfaceStub extends io.grpc.stub.AbstractAsyncStub<TodoInterfaceStub> {
    private TodoInterfaceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoInterfaceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TodoInterfaceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.ilt.example.todo.TodoRequest> index(
        io.grpc.stub.StreamObserver<org.ilt.example.todo.Summary> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getIndexMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class TodoInterfaceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TodoInterfaceBlockingStub> {
    private TodoInterfaceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoInterfaceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TodoInterfaceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class TodoInterfaceFutureStub extends io.grpc.stub.AbstractFutureStub<TodoInterfaceFutureStub> {
    private TodoInterfaceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoInterfaceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TodoInterfaceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_INDEX = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TodoInterfaceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TodoInterfaceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INDEX:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.index(
              (io.grpc.stub.StreamObserver<org.ilt.example.todo.Summary>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TodoInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TodoInterfaceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.ilt.example.todo.TodoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TodoInterface");
    }
  }

  private static final class TodoInterfaceFileDescriptorSupplier
      extends TodoInterfaceBaseDescriptorSupplier {
    TodoInterfaceFileDescriptorSupplier() {}
  }

  private static final class TodoInterfaceMethodDescriptorSupplier
      extends TodoInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TodoInterfaceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TodoInterfaceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TodoInterfaceFileDescriptorSupplier())
              .addMethod(getIndexMethod())
              .build();
        }
      }
    }
    return result;
  }
}
