# Use an official Java 17 base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the project files
COPY . .

# Build the project using Maven
RUN mvn clean package

# Expose the port
EXPOSE 8080
