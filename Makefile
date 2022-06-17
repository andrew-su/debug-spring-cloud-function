APP_JAR=application/target/application-1.0.jar
FUNCTION_JAR=functions/target/my-funcs-1.0.jar

.PHONY: application functions run curl list
application:
	cd application && mvn package
	
functions:
	cd functions && mvn package

run: application
	java -jar $(APP_JAR)

curl:
	curl -H "Content-Type: text/plain" -d Andrew -i -w'\n' localhost:8080/$(ENDPOINT) 

list:
	curl -H "Content-Type: text/plain" -i -w'\n' localhost:8080/actuator/functions 