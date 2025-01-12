# Use a Maven image as the base
FROM maven:3.8.4-jdk-11-slim

# Set the working directory
WORKDIR /app

# Copy the project files
COPY . .

# Build the project using Maven
RUN mvn clean package

# Expose the port
EXPOSE 8080
