FROM openjdk:8-jdk-alpine
RUN ./mvn clean install -DskipTest=true -Dmaven.test.failure.ignore=true
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
