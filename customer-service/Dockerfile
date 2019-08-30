# Start with a base image containing Java runtime
FROM java:8

# Make port 8080 available to the world outside this container
EXPOSE 8080

ADD target/customer-service.jar customer-service-0.1.0.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","customer-service-0.1.0.jar"]