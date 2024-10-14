FROM maven:3.8.6-eclipse-temurin-17 AS builder
WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

COPY --from=builder /app/target/mon-appli.jar /app/mon-appli.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/mon-appli.jar"]
