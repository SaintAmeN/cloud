FROM maven:3.8.6-jdk-11-slim

WORKDIR /app/

#COPY . /app/
#RUN mvn package -DskipTests=true
COPY target/receiver-0.0.1-SNAPSHOT.jar /app/

EXPOSE 8082
#ENTRYPOINT ["java", "-jar", "target/receiver-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT ["java", "-jar", "receiver-0.0.1-SNAPSHOT.jar"]