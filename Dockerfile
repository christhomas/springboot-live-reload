FROM maven:3.8.5-openjdk-11 AS maven

RUN apt update && apt install -y supervisor
COPY ./supervisord.conf /etc/supervisord.conf

COPY . /app
WORKDIR /app

RUN mvn package
RUN find /app
EXPOSE 8080

CMD ["/usr/bin/supervisord", "-c", "/etc/supervisord.conf"]

# FROM openjdk:latest

# COPY --from=maven /app/target/application-1.0.0.jar /application-1.0.0.jar
# COPY . /app
# EXPOSE 8080

# CMD ["java", "-jar", "/application-1.0.0.jar"]