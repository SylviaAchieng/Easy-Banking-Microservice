#start with a base image containg java runtime
FROM openjdk:21-jdk-slim

#Information around who maintains the image
MAINTAINER sylvia408.com

#Add application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#Execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]