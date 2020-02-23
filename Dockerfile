FROM openjdk:8

LABEL MAINTAINER "Dinesh Kapoor <dineshkapoor27@gmail.com>"

VOLUME /tmp
EXPOSE 8080

RUN set -ex \
  && apt-get update -y \
  && apt-get upgrade -y \
  && apt-get install git \
  && mkdir /subscription \
  && git clone "https://github.com/dineshkapoor27/subscriptions.git" /subscription \
  && cd /subscription \
  && ./mvnw package spring-boot:repackage \
  && cp target/subscriptions-0.0.1-SNAPSHOT.jar subscriptions.jar \
  && ls -al

CMD [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "subscription/subscriptions.jar" ]
