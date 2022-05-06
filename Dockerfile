FROM maven:3.8.5-eclipse-temurin-8-alpine
RUN mkdir /var/hello_world
COPY /var/jenkins_home/workspace/Hello_world  /var/hello_world
WORKDIR /var/hello_world
RUN mvn package
CMD ["java", "-jar" ,"/var/hello_world/target/jb-hello-world-maven-0.2.0.jar"]
