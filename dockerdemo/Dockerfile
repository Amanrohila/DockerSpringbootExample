FROM openjdk:8
ADD target/dockerdemo.jar dockerdemo.jar
EXPOSE 8084
ENTRYPOINT ["java","-jar","/dockerdemo.jar"]
# ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dockerdemo.jar"]