FROM eclipse-temurin:17-jre
EXPOSE 8085
ADD target/vangitactions-docker.jar vangitactions-docker.jar
ENTRYPOINT [ "java", "-jar", "/vangitactions-docker.jar" ]