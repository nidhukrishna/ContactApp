# Contact Management API - Dockerfile
# Created by Sharvesh S

# Use OpenJDK 21 as base image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy Maven wrapper and pom.xml
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Make Maven wrapper executable
RUN chmod +x mvnw

# Download dependencies
RUN ./mvnw dependency:go-offline -B

# Copy source code
COPY src src

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose port 8080
EXPOSE 8080

# Create uploads directory
RUN mkdir -p /app/uploads

# Run the application
CMD ["java", "-jar", "target/contact-management-api-1.0.0.jar"]

# Add labels for metadata
LABEL maintainer="Sharvesh S"
LABEL description="Contact Management API - Spring Boot Application"
LABEL version="1.0.0"
LABEL repository="https://github.com/S-Sharvesh/Contact-Management-App"
