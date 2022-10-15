FROM maven:3.8.6-jdk-11-slim

WORKDIR /app/

#COPY . /app/
#RUN mvn package -DskipTests=true
COPY target/eureka-0.0.1-SNAPSHOT.jar /app/

EXPOSE 8761
#ENTRYPOINT ["java", "-jar", "target/eureka-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT ["java", "-jar", "eureka-0.0.1-SNAPSHOT.jar"]