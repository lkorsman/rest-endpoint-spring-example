# REST Endpoint Spring Example

The REST Endpoint Spring Example repository is a Spring Boot based project written in Java. The purpose of this project was to refresh my knowledge of Spring and REST. The project mainly follows the [TUTORIAL](https://spring.io/guides/tutorials/rest/) from [Spring.io)[https://spring.io/].

## Project Setup

As mentioned, the project is a Spring Boot application written in Java using Maven. Once the project is cloned, you can build and run the project via command line.

```bash
$ ./mvnw clean spring-boot:run
```

## Structure

The project contains one folder which houses all classes and interfaces. As this is a small project with only a few classes, I decided to keep everything in the **sampleRestEndpoint/payroll/** folder. 

There are 2 controllers
1. Employee
2. Order

The **Employee** controller will perform basic CRUD operations on an Employee.

The **Order** controller will perform basic CRUD operations on an Order. The Order controller contains some business logic to mimic the order of operations when placing an order (similiar to online shopping). 

## Storage / Database

The project uses JPA to access our data and uses an H2 in memory database.
