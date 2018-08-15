# spring-cloud-stream
A sample project using advanced Spring Cloud Stream features like message filtering, 
Apache Avro, etc.

## Work in progress
The development of the advanced features, was 
paused because of missing support for Java 8+ Time API in Avro 1.8.2 !!!!

## Kafka Docker image 
We are using the following Docker image to get started with a 
simple single node Kafka cluster:

https://hub.docker.com/r/wurstmeister/kafka/

To use the latest version you need to download the repository 
and use the desired docker-compose file to build the images.

To keep it simple all necessary files where copied to the docker folder
in this project. To start the build and image, just navigate into
the folder an execute the following command to start a single node
cluster ```docker-compose up -d```. (It will start in the background)

## Avro Schema Registry server
To be able to use avro schemas a registry server can be used, to provide and
collect the definitions of the data.

### Links
1. https://cloud.spring.io/spring-cloud-stream/
2. https://hub.docker.com/r/wurstmeister/kafka/
3. https://github.com/jayTobi/avro-schema-registry-server
4. https://avro.apache.org/
5. https://www.docker.com/
