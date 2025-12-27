
FROM openjdk:27-ea-slim-trixie

WORKDIR /app

COPY target/my-app-1.1.2-SNAPSHOT.jar app.jar

CMD ["java","-jar","app.jar"]

