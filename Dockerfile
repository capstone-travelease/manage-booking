FROM openjdk:21

VOLUME /tmp

COPY target/*.jar booking-management-0.0.1-SNAPSHOT.jar

EXPOSE 1400
ENTRYPOINT ["java","-jar","/booking-management-0.0.1-SNAPSHOT.jar"]