# spring-boot-swagger-api-gateway

* To build: `mvn clean install && mvn package`
* To run: `java -jar target/hello-0.0.3-SNAPSHOT.jar`
* To view: [swagger-ui](http://localhost:8080/swagger-ui/)
* To view: [api-docs](http://localhost:8080/v2/api-docs)

## Import swagger api-docs into api-gateway 
In this repo you will find swagger.json as an example. Visit [api-docs](http://localhost:8080/v2/api-docs) to have yours generate for you. Save it to your local disk then run: 

* With AWS CLI v2: ```aws apigateway import-rest-api --cli-binary-format raw-in-base64-out --body 'file://swagger.json'``` as per [Stack Overflow](https://stackoverflow.com/a/60760798/7223300)