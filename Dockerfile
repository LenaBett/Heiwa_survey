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
##RUN rm -rf /opt/jboss/wildfly/standalone/deployments/*.war

# Expose port 8080 for the application
EXPOSE 8080

# Set the default command to start WildFly and bind it to all network interfaces
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0"]
