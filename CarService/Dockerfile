#Never use this image in production. Too much vulnurability
FROM openjdk:17-jdk-alpine
LABEL maintainer="Taha yassine ELLEUCH <taha-yassine.elleuch@atos.net>"
ARG JAR_FILE=target/CarService-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
