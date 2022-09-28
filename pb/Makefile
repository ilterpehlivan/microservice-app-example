PROTOC_GEN_GO_OUT = ./interfaces
PROTO_SRC_DIR = ./src/main/proto
PROTOC_GEN_GO_BIN = ./interfaces

GO_MODULE = github.com/ilterpehlivan/interfaces

clean/java: ## Clean the repo
	echo "Executing gradle clean..."
	gradle clean
	
clean/go: ## clean the repo
	echo "Cleaning up..." 
	rm -rf $(PROTOC_GEN_GO_OUT)
	rm -rf $(PROTOC_GEN_GO_BIN)
	
protogen: ## Generate proto files
	mkdir -p $(PROTOC_GEN_GO_OUT)
	rm -rf $(PROTOC_GEN_GO_OUT)/*
	protoc \
	-I=$(PROTO_SRC_DIR) \
        	--go_out=$(PROTOC_GEN_GO_OUT) \
        	--go-grpc_out=$(PROTOC_GEN_GO_OUT) \
        	--go_opt=module=$(GO_MODULE) \
        	--go-grpc_opt=module=$(GO_MODULE) \
        	$(PROTO_SRC_DIR)/*.proto; \

build/java: ## Build the java code
    #first plugins and publish local as it was required by interfaces
	#cd convention-plugins;gradle --build-cache clean build publish
    #then interfaces
	gradle --build-cache clean build

build/go: ## Build the go code
	$(MAKE) clean/go
	$(MAKE) protogen
