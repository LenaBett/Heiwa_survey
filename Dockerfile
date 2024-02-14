# Use the Maven image with JDK 17 and Eclipse Temurin on Alpine Linux as the build environment
FROM maven:3.9.5-eclipse-temurin-17-alpine AS build
LABEL authors="lenabett"

# Set the working directory inside the container to /app
WORKDIR /app

# Copy the entire current directory (.) into the container at /app
COPY . .

# Run Maven to clean, build, and install the project, skipping tests
RUN mvn clean install -DskipTests -X

# # Remove Maven and its dependencies
# RUN apk --no-cache del maven

# Use the WildFly image with JDK 17 as the deployment environment
FROM quay.io/wildfly/wildfly:26.1.3.Final-jdk11 AS deploy

# Remove the default WildFly standalone.xml configuration file
RUN rm /opt/jboss/wildfly/standalone/configuration/standalone.xml

# Copy the compiled WAR file from the build stage to WildFly deployments directory
COPY --from=build /app/target/*.war /opt/jboss/wildfly/standalone/deployments/

# Copy a custom standalone.xml configuration file to WildFly configuration directory
COPY --from=build /app/standalone.xml /opt/jboss/wildfly/standalone/configuration/

# Create directories and copy MySQL module configuration and JDBC driver to WildFly modules directory
RUN mkdir -p /opt/jboss/wildfly/modules/system/layers/base/com/mysql/main/
COPY --from=build /app/module.xml /opt/jboss/wildfly/modules/system/layers/base/com/mysql/main/
COPY --from=build /app/mysql-connector-java-8.0.17.jar /opt/jboss/wildfly/modules/system/layers/base/com/mysql/main/


# Optional: Clear WildFly deployments directory
RUN rm -rf /opt/jboss/wildfly/standalone/deployments/*.war

# Expose port 8080 for the application
EXPOSE 8080

# Set the default command to start WildFly and bind it to all network interfaces
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0"]



#  Second Docker file -- has a wildfly error when running the  image
# # Stage 1: Build stage
# FROM maven:3.6.0-jdk-13-alpine AS build

# # # Set the working directory inside the container
# WORKDIR /app

# # # Copy the contents of the current directory to the working directory
# COPY . .

# # # Build the Maven project, skipping tests
# RUN mvn clean install -DskipTests -X

# # # Remove Maven and its dependencies to reduce image size
# RUN apk --no-cache del maven

# # # Stage 2: WildFly stage
# FROM jboss/wildfly:latest AS deploy

# # # Remove the default standalone.xml file from WildFly
# RUN rm /opt/jboss/wildfly/standalone/configuration/standalone.xml

# # # Copy the built WAR file from the build stage to the WildFly deployment directory
# COPY --from=build /app/target/*.war /opt/jboss/wildfly/standalone/deployments/

# # # Copy the custom standalone.xml file to the WildFly configuration directory
# COPY --from=build /app/standalone.xml /opt/jboss/wildfly/standalone/configuration/

# # # # Copy the mysql folder to the WildFly modules directory
# # # COPY --from=build /app/mysql /opt/jboss/wildfly/modules/system/layers/base/com/

# # # Create the necessary directories
# RUN mkdir -p /opt/jboss/wildfly/modules/system/layers/base/com/mysql/main/

# # # Copy the module.xml file to the WildFly mysql directory
# COPY --from=build /app/mysql/main/module.xml /opt/jboss/wildfly/modules/system/layers/base/com/mysql/main/

# # # Download and copy the MySQL Connector/J JAR file to the WildFly modules directory
# RUN curl -o /opt/jboss/wildfly/modules/system/layers/base/com/mysql/main/connector-java-8.0.17.jar \
#     https://repo1.maven.org/maven2/mysql/mysql-connector-java/8.0.17/connector-java-8.0.17.jar

# # # Expose port 8080 for the application
# EXPOSE 8080

# # # Start WildFly
# CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0"]





# #working Dockerfile
# # # Stage 1: Build the application
# FROM maven:3.9.5 as build

# # # Set the working directory inside the container
# WORKDIR /app

# # # Copy the application source code into the container
# COPY . .

# # # Run Maven to clean, compile, and package the application
# RUN mvn clean compile package

# # # Stage 2: Deploy the application to WildFly
# FROM jboss/wildfly:latest AS deploy


# # # Copy the WAR file built in the previous stage to WildFly's deployment directory
# COPY --from=build /app/target/*.war /opt/jboss/wildfly/standalone/deployments/

# # # Expose port 8080 for the application
# EXPOSE 8080
