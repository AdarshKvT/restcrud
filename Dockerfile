FROM openjdk:8-jdk-alpine as build
RUN apk add --no-cache maven
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} restcrud.jar
ENTRYPOINT ["java","-jar","/restcrud.jar"]
