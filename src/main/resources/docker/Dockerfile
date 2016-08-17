FROM java:8

MAINTAINER ghislainN<ghislain.ngonpa@gmail.com>

#RUN apt-get update

ADD build/libs/synapsis-subscription*.jar /app/synapsis-subscription.jar
ADD src/main/resources/docker/run.sh /app/

RUN chmod +x /app/synapsis-subscription.jar
RUN chmod +x /app/run.sh

EXPOSE 8080

ENTRYPOINT ["bash","run.sh"]

WORKDIR /app