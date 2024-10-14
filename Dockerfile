# Étape 1 : Builder l'application avec Java 17
FROM maven:3.8.6-eclipse-temurin-17 AS builder
WORKDIR /app

# Copier les fichiers du projet
COPY pom.xml .
COPY src ./src

# Compiler l'application et construire le JAR
RUN mvn clean package -DskipTests

# Étape 2 : Créer l'image de l'application
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copier le JAR généré depuis l'étape de build
COPY --from=builder /app/target/mon-appli.jar /app/mon-appli.jar

# Exposer le port utilisé par Spring Boot
EXPOSE 8080

# Démarrer l'application
ENTRYPOINT ["java", "-jar", "/app/mon-appli.jar"]