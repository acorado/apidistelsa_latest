FROM openjdk:8-jdk-alpine
COPY demo-0.0.1-SNAPSHOT.jar /home/demo-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/home/demo-0.0.1-SNAPSHOT.jar"]

EXPOSE 1013/TCP