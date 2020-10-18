

build: build-server build-client 

build-server: 
	javac -cp "jersey-bundle-1.19.jar" webservice/*.java

build-client:
	 javac -cp "jersey-bundle-1.19.jar" webservice/Cliente.java

run-server: 
	java -cp ".:jersey-bundle-1.19.jar" webservice.Servidor

run-client: 
	 java -cp ".:jersey-bundle-1.19.jar" webservice.Cliente
