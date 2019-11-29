FROM java:8
VOLUME /tmp
ADD build/libs/hotel-api-0.0.1-SNAPSHOT.jar totel-api.jar

ENTRYPOINT ["java","-Dserver.port=8090","-jar","/var/hotel/totel-api.jar"]
EXPOSE 8090