FROM openjdk:11
EXPOSE 8088
ADD target/ratings-data-service.jar ratings-data-service.jar

ENTRYPOINT ["java","-jar","/ratings-data-service.jar"]