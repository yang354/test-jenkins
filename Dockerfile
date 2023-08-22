FROM openjdk:8
ADD target/test-jenkins-1.0-SNAPSHOT.jar test-jenkins.jar
EXPOSE 8888
ENTRYPOINT java -jar /test-jenkins.jar
