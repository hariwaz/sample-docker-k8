FROM openjdk:20-jdk-slim
VOLUME /tmp
EXPOSE 8085
ARG JAR_FILE=build/libs/sample-docker-k8-1.0.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]