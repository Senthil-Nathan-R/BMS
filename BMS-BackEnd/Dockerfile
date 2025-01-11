# Use Maven to build the application
FROM maven:3.8.4-openjdk-11 AS builder

# Set working directory for the build stage
WORKDIR /app

# Copy the entire repository to the Docker image (including pom.xml and source code)
COPY . /app

# Build the project using Maven
RUN mvn clean package -DskipTests

# Use a smaller JDK image for running the app
FROM openjdk:11-jre-slim

# Set working directory for the runtime stage
WORKDIR /app

# Copy the JAR file from the builder stage
COPY --from=builder /app/target/BMS-BackEnd-0.0.1-SNAPSHOT.jar /app/BMS-BackEnd.jar

# Expose the port your app runs on
EXPOSE 8080

# Command to run the Spring Boot application
CMD ["java", "-jar", "BMS-BackEnd.jar"]
