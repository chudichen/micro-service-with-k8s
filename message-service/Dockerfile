FROM adoptopenjdk/openjdk11:latest
MAINTAINER chudichen@foxmail.com

COPY message-provider/target/*.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]