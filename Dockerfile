FROM java:8-jdk-alpine

COPY ./build/libs/rest-service-app-0.1.0.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch rest-service-app-0.1.0.jar'

ENTRYPOINT ["java","-jar","rest-service-app-0.1.0.jar"]