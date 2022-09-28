package org.ilt.example.todo;

import static org.ilt.example.todo.TodoInterfaceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by ReactorGrpc generator",
comments = "Source: todo.proto")
public final class ReactorTodoInterfaceGrpc {
    private ReactorTodoInterfaceGrpc() {}

    public static ReactorTodoInterfaceStub newReactorStub(io.grpc.Channel channel) {
        return new ReactorTodoInterfaceStub(channel);
    }

    public static final class ReactorTodoInterfaceStub extends io.grpc.stub.AbstractStub<ReactorTodoInterfaceStub> {
        private TodoInterfaceGrpc.TodoInterfaceStub delegateStub;

        private ReactorTodoInterfaceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = TodoInterfaceGrpc.newStub(channel);
        }

        private ReactorTodoInterfaceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = TodoInterfaceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected ReactorTodoInterfaceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReactorTodoInterfaceStub(channel, callOptions);
        }

        public reactor.core.publisher.Mono<org.ilt.example.todo.Summary> index(reactor.core.publisher.Flux<org.ilt.example.todo.TodoRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.manyToOne(reactorRequest, delegateStub::index);
        }

    }

    public static abstract class TodoInterfaceImplBase implements io.grpc.BindableService {

        public reactor.core.publisher.Mono<org.ilt.example.todo.Summary> index(reactor.core.publisher.Flux<org.ilt.example.todo.TodoRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            org.ilt.example.todo.TodoInterfaceGrpc.getIndexMethod(),
                            asyncClientStreamingCall(
                                    new MethodHandlers<
                                            org.ilt.example.todo.TodoRequest,
                                            org.ilt.example.todo.Summary>(
                                            this, METHODID_INDEX)))
                    .build();
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
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_INDEX:
                    return (io.grpc.stub.StreamObserver<Req>) com.salesforce.reactorgrpc.stub.ServerCalls.manyToOne(
                            (io.grpc.stub.StreamObserver<org.ilt.example.todo.Summary>) responseObserver,
                            serviceImpl::index);
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
