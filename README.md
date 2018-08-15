# spring-cloud-stream
A sample project using advanced Spring Cloud Stream features like message filtering, avro, etc.

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