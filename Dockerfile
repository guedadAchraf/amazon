# Use OpenJDK 11 as base image
FROM openjdk:17-jdk-slim


# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
COPY target/company-aws.jar /app/company-aws.jar

# Expose the port on which your Spring Boot application will run
EXPOSE 9090

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "company-aws.jar"]
