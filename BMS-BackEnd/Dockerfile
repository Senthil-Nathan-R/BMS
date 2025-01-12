# Use an official OpenJDK image with Java 17
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Install Maven
RUN apt-get update && apt-get install -y maven

# Copy the project files
COPY . .

# Build the project using Maven
RUN mvn clean package

# Expose the port
EXPOSE 8080
