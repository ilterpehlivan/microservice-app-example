// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.21.6
// source: todo.proto

package todo

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// TodoInterfaceClient is the client API for TodoInterface service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type TodoInterfaceClient interface {
	Index(ctx context.Context, opts ...grpc.CallOption) (TodoInterface_IndexClient, error)
}

type todoInterfaceClient struct {
	cc grpc.ClientConnInterface
}

func NewTodoInterfaceClient(cc grpc.ClientConnInterface) TodoInterfaceClient {
	return &todoInterfaceClient{cc}
}

func (c *todoInterfaceClient) Index(ctx context.Context, opts ...grpc.CallOption) (TodoInterface_IndexClient, error) {
	stream, err := c.cc.NewStream(ctx, &TodoInterface_ServiceDesc.Streams[0], "/org.ilt.example.todo.TodoInterface/Index", opts...)
	if err != nil {
		return nil, err
	}
	x := &todoInterfaceIndexClient{stream}
	return x, nil
}

type TodoInterface_IndexClient interface {
	Send(*TodoRequest) error
	CloseAndRecv() (*Summary, error)
	grpc.ClientStream
}

type todoInterfaceIndexClient struct {
	grpc.ClientStream
}

func (x *todoInterfaceIndexClient) Send(m *TodoRequest) error {
	return x.ClientStream.SendMsg(m)
}

func (x *todoInterfaceIndexClient) CloseAndRecv() (*Summary, error) {
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	m := new(Summary)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// TodoInterfaceServer is the server API for TodoInterface service.
// All implementations must embed UnimplementedTodoInterfaceServer
// for forward compatibility
type TodoInterfaceServer interface {
	Index(TodoInterface_IndexServer) error
	mustEmbedUnimplementedTodoInterfaceServer()
}

// UnimplementedTodoInterfaceServer must be embedded to have forward compatible implementations.
type UnimplementedTodoInterfaceServer struct {
}

func (UnimplementedTodoInterfaceServer) Index(TodoInterface_IndexServer) error {
	return status.Errorf(codes.Unimplemented, "method Index not implemented")
}
func (UnimplementedTodoInterfaceServer) mustEmbedUnimplementedTodoInterfaceServer() {}

// UnsafeTodoInterfaceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to TodoInterfaceServer will
// result in compilation errors.
type UnsafeTodoInterfaceServer interface {
	mustEmbedUnimplementedTodoInterfaceServer()
}

func RegisterTodoInterfaceServer(s grpc.ServiceRegistrar, srv TodoInterfaceServer) {
	s.RegisterService(&TodoInterface_ServiceDesc, srv)
}

func _TodoInterface_Index_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(TodoInterfaceServer).Index(&todoInterfaceIndexServer{stream})
}

type TodoInterface_IndexServer interface {
	SendAndClose(*Summary) error
	Recv() (*TodoRequest, error)
	grpc.ServerStream
}

type todoInterfaceIndexServer struct {
	grpc.ServerStream
}

func (x *todoInterfaceIndexServer) SendAndClose(m *Summary) error {
	return x.ServerStream.SendMsg(m)
}

func (x *todoInterfaceIndexServer) Recv() (*TodoRequest, error) {
	m := new(TodoRequest)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// TodoInterface_ServiceDesc is the grpc.ServiceDesc for TodoInterface service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var TodoInterface_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "org.ilt.example.todo.TodoInterface",
	HandlerType: (*TodoInterfaceServer)(nil),
	Methods:     []grpc.MethodDesc{},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "Index",
			Handler:       _TodoInterface_Index_Handler,
			ClientStreams: true,
		},
	},
	Metadata: "todo.proto",
}