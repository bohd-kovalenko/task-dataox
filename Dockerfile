FROM openjdk:17-alpine
EXPOSE 8080
WORKDIR /app
COPY target/test-task-dataox-0.0.1-SNAPSHOT.jar /app/application.jar
ENTRYPOINT ["java","-jar","application.jar"]
