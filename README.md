# REST Endpoint Spring Example

The REST Endpoint Spring Example repository is a Spring Boot based project written in Java. The purpose of this project was to refresh my knowledge of Spring and REST. The project mainly follows the [TUTORIAL](https://spring.io/guides/tutorials/rest/) from [Spring.io](https://spring.io). 

UPDATE 06Feb2024: I have added Kafka to the project with a basic POST mapping sending messages to a sample topic.

## Project Setup

As mentioned, the project is a Spring Boot application written in Java using Maven. Once the project is cloned, you can build and run the project via command line.

```bash
$ ./mvnw clean spring-boot:run
```

## Structure

The project contains a few folders within **/main/** (config, kafka, payroll). 
* config contains the Producer and Consumer code for a sample Kafka topic
* kafka contains the endpoint to produce Kafka messages and the record class of the Message
* payroll contains the code for the [TUTORIAL](https://spring.io/guides/tutorials/rest/) mentioned above

## Storage / Database

The project uses JPA to access our data and uses an H2 in memory database.
