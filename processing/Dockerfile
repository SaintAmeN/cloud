FROM maven:3.8.6-jdk-11-slim

WORKDIR /app/

#COPY . /app/
#RUN mvn package -DskipTests=true
COPY target/processing-0.0.1-SNAPSHOT.jar /app/

EXPOSE 8081
ENTRYPOINT ["java", "-jar", "target/processing-0.0.1-SNAPSHOT.jar"]