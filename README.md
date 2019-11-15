# DockerSpringbootExample
1. Make simple Springboot application

2. Add below Docker File
FROM openjdk:8
ADD target/dockerdemo.jar dockerdemo.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","/dockerdemo.jar"]
# ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dockerdemo.jar"]

3. Add jar file to a particular path in linux  via build  
/root/apache-maven-3.6.2/bin/mvn clean package

4. Run below command to make image file
docker build -f Dockerfile -t dockerdemotag .
#here -f stands for file name

5. Check images with below command 
"docker images"

6. Check running caintainer with below command docker
"docker ps -a"

7. Finally run image with below command
"docker run -p 8085:8085 dockerdemotag &"

8. Now check with bleow url
http://localhost:8085//rest/docker/hello or http://192.168.56.101:8085//rest/docker/hello 
# note you can get ip is from ifconfig

9. You can check running caintaner with following command
"docker ps -a" and result must be something 
CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS                              NAMES
47cff142595c        dockerdemotag       "java -Djava.secur..."   12 minutes ago      Up 12 minutes       8084/tcp, 0.0.0.0:8085->8085/tcp   eager_nobel
