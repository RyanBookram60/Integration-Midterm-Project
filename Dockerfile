# syntax=docker/dockerfile:1

FROM maven:3.9.8-eclipse-temurin-21
WORKDIR /midterm-app
COPY . .
RUN mvn clean package
RUN apt-get update && apt-get install -y docker.io
CMD ["java", "-jar", "/midterm-app/target/midterm-app-1.0-SNAPSHOT.jar"]

EXPOSE 3000
