package org.ilt.example.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: authenticate.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthInterfaceGrpc {

  private AuthInterfaceGrpc() {}

  public static final String SERVICE_NAME = "org.ilt.example.auth.AuthInterface";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      org.ilt.example.auth.UserInfo> getAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authenticate",
      requestType = com.google.protobuf.StringValue.class,
      responseType = org.ilt.example.auth.UserInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      org.ilt.example.auth.UserInfo> getAuthenticateMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, org.ilt.example.auth.UserInfo> getAuthenticateMethod;
    if ((getAuthenticateMethod = AuthInterfaceGrpc.getAuthenticateMethod) == null) {
      synchronized (AuthInterfaceGrpc.class) {
        if ((getAuthenticateMethod = AuthInterfaceGrpc.getAuthenticateMethod) == null) {
          AuthInterfaceGrpc.getAuthenticateMethod = getAuthenticateMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, org.ilt.example.auth.UserInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Authenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ilt.example.auth.UserInfo.getDefaultInstance()))
              .setSchemaDescriptor(new AuthInterfaceMethodDescriptorSupplier("Authenticate"))
              .build();
        }
      }
    }
    return getAuthenticateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthInterfaceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthInterfaceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthInterfaceStub>() {
        @java.lang.Override
        public AuthInterfaceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthInterfaceStub(channel, callOptions);
        }
      };
    return AuthInterfaceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthInterfaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthInterfaceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthInterfaceBlockingStub>() {
        @java.lang.Override
        public AuthInterfaceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthInterfaceBlockingStub(channel, callOptions);
        }
      };
    return AuthInterfaceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthInterfaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthInterfaceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthInterfaceFutureStub>() {
        @java.lang.Override
        public AuthInterfaceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthInterfaceFutureStub(channel, callOptions);
        }
      };
    return AuthInterfaceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AuthInterfaceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *given token as parameter if authenticate then return user details
     *otherwise error
     * </pre>
     */
    public void authenticate(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<org.ilt.example.auth.UserInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthenticateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                org.ilt.example.auth.UserInfo>(
                  this, METHODID_AUTHENTICATE)))
          .build();
    }
  }

  /**
   */
  public static final class AuthInterfaceStub extends io.grpc.stub.AbstractAsyncStub<AuthInterfaceStub> {
    private AuthInterfaceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthInterfaceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthInterfaceStub(channel, callOptions);
    }

    /**
     * <pre>
     *given token as parameter if authenticate then return user details
     *otherwise error
     * </pre>
     */
    public void authenticate(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<org.ilt.example.auth.UserInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthInterfaceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AuthInterfaceBlockingStub> {
    private AuthInterfaceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthInterfaceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthInterfaceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *given token as parameter if authenticate then return user details
     *otherwise error
     * </pre>
     */
    public org.ilt.example.auth.UserInfo authenticate(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthInterfaceFutureStub extends io.grpc.stub.AbstractFutureStub<AuthInterfaceFutureStub> {
    private AuthInterfaceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthInterfaceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthInterfaceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *given token as parameter if authenticate then return user details
     *otherwise error
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.ilt.example.auth.UserInfo> authenticate(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHENTICATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthInterfaceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthInterfaceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHENTICATE:
          serviceImpl.authenticate((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<org.ilt.example.auth.UserInfo>) responseObserver);
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

  private static abstract class AuthInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthInterfaceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.ilt.example.auth.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthInterface");
    }
  }

  private static final class AuthInterfaceFileDescriptorSupplier
      extends AuthInterfaceBaseDescriptorSupplier {
    AuthInterfaceFileDescriptorSupplier() {}
  }

  private static final class AuthInterfaceMethodDescriptorSupplier
      extends AuthInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthInterfaceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthInterfaceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthInterfaceFileDescriptorSupplier())
              .addMethod(getAuthenticateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
