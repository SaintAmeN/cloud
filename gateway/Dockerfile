FROM maven:3.8.6-jdk-11-slim

WORKDIR /app/

#COPY . /app/
#RUN mvn package -DskipTests=true
COPY target/gateway-0.0.1-SNAPSHOT.jar /app/

EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "target/gateway-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT ["java", "-jar", "gateway-0.0.1-SNAPSHOT.jar"]