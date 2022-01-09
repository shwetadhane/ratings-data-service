FROM openjdk:11
EXPOSE 9097
ADD target/ratings-data-service.jar ratings-data-service.jar

ENTRYPOINT ["java","-jar","/ratings-data-service.jar"]