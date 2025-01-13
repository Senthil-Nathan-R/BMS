# Use an official Maven image to build the project
FROM maven:3.9.4-eclipse-temurin-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the project files into the container
COPY . .

# Build the project using Maven
RUN mvn clean package

# Use a lightweight JDK image to run the application
FROM eclipse-temurin:17-jre

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the build stage to the runtime image
COPY --from=build /app/target/BMS-BackEnd-0.0.1-SNAPSHOT.jar /app/BMS-BackEnd.jar

# Expose the port your application will run on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/BMS-BackEnd.jar"]
