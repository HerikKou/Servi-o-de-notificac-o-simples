# Build stage
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app

COPY pom.xml .
COPY src ./src

# Compila sem rodar testes
RUN mvn clean package -DskipTests

# Runtime stage
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copia o JAR compilado
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

# Entry point simples
ENTRYPOINT ["java", "-jar", "app.jar"]
