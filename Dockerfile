FROM java:8
USER root
VOLUME /tmp
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ADD build/libs/hotel-api-0.0.1-SNAPSHOT.jar /opt/hotel/totel-api.jar
ENTRYPOINT ["java","-Dserver.port=8090","-jar","/opt/hotel/totel-api.jar"]
EXPOSE 8090