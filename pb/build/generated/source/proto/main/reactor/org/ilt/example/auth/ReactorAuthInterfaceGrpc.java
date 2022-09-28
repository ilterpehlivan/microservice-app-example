package org.ilt.example.auth;

import static org.ilt.example.auth.AuthInterfaceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by ReactorGrpc generator",
comments = "Source: authenticate.proto")
public final class ReactorAuthInterfaceGrpc {
    private ReactorAuthInterfaceGrpc() {}

    public static ReactorAuthInterfaceStub newReactorStub(io.grpc.Channel channel) {
        return new ReactorAuthInterfaceStub(channel);
    }

    public static final class ReactorAuthInterfaceStub extends io.grpc.stub.AbstractStub<ReactorAuthInterfaceStub> {
        private AuthInterfaceGrpc.AuthInterfaceStub delegateStub;

        private ReactorAuthInterfaceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = AuthInterfaceGrpc.newStub(channel);
        }

        private ReactorAuthInterfaceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = AuthInterfaceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected ReactorAuthInterfaceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReactorAuthInterfaceStub(channel, callOptions);
        }

        /**
         * <pre>
         * given token as parameter if authenticate then return user details
         * otherwise error
         * </pre>
         */
        public reactor.core.publisher.Mono<org.ilt.example.auth.UserInfo> authenticate(reactor.core.publisher.Mono<com.google.protobuf.StringValue> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::authenticate);
        }

        /**
         * <pre>
         * given token as parameter if authenticate then return user details
         * otherwise error
         * </pre>
         */
        public reactor.core.publisher.Mono<org.ilt.example.auth.UserInfo> authenticate(com.google.protobuf.StringValue reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::authenticate);
        }

    }

    public static abstract class AuthInterfaceImplBase implements io.grpc.BindableService {

        /**
         * <pre>
         * given token as parameter if authenticate then return user details
         * otherwise error
         * </pre>
         */
        public reactor.core.publisher.Mono<org.ilt.example.auth.UserInfo> authenticate(reactor.core.publisher.Mono<com.google.protobuf.StringValue> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            org.ilt.example.auth.AuthInterfaceGrpc.getAuthenticateMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.google.protobuf.StringValue,
                                            org.ilt.example.auth.UserInfo>(
                                            this, METHODID_AUTHENTICATE)))
                    .build();
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
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((com.google.protobuf.StringValue) request,
                            (io.grpc.stub.StreamObserver<org.ilt.example.auth.UserInfo>) responseObserver,
                            serviceImpl::authenticate);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
