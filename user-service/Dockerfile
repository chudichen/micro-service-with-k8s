FROM adoptopenjdk/openjdk11:latest
MAINTAINER chudichen@foxmail.com

COPY ./user-provider/target/*.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]