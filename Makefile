

server: 
	javac -cp "jersey-bundle-1.19.jar" webservice/*.java

run-server: 
	java -cp ".:jersey-bundle-1.19.jar" webservice.Servidor
