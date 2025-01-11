# Use an official Maven image as the base
FROM maven:3.8.4-openjdk-11

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven `pom.xml` and source code
COPY ./BMS-BackEnd /app

# Run the Maven build command
RUN mvn clean package

# Expose the port that the app will run on
EXPOSE 8080

# Command to run the app (assuming it's a Spring Boot app)
CMD ["java", "-jar", "target/BMS-BackEnd-0.0.1-SNAPSHOT.jar"]
