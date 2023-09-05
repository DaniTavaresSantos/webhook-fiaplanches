FROM maven:latest

WORKDIR /app
RUN rm -rf /app/*
COPY /webhook-fiaplanches /app
RUN mvn clean install -DskipTests
RUN mkdir jar
RUN mv /app/target/WebHookFiapLanches-0.0.1-SNAPSHOT.jar /app/jar/WebHookFiapLanches-0.0.1-SNAPSHOT.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/jar/WebHookFiapLanches-0.0.1-SNAPSHOT.jar"]
