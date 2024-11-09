## Spring Boot Sandbox  

This project is your playground to explore building Spring Boot applications with a focus on persistence using Liquibase and Spring Data JPA. 

We'll also dive into Docker and Testcontainers to manage databases and run integration tests!


### Built With

Here's a breakdown of the tools and frameworks used in this project:

* **Spring Boot:** Rapid application development framework for building robust Java applications.
* **Liquibase:** Manages database schema changes in a version-controlled manner.
* **Spring Data JPA:** Simplifies data access with JPA repositories.
* **Maven:** Build automation tool
* **Docker:** Containerizes the application for reproducible environments.
* **Testcontainers:** Provides in-memory databases for unit tests.
* **PostgreSQL:** Object-relational database management system.
* **Java:** The programming language powering the application.


### Getting Started

Let's get your hands dirty! 

Here's what you need to get started:

#### Prerequisites

* **Java 21 or higher:** Make sure you have Java installed with a working development environment (JDK).
* **Docker:** Download and install Docker Desktop for your operating system.

#### Installation

1. Clone this repository using `git clone https://github.com:geodwz/sandbox-liquibase.git`.
2. Navigate to the project directory using `cd sandbox-liquibase`.
3. Build the project using `mvn clean install`.

### Usage

Once the project is built, you can use Docker Compose to run the application alongside a PostgreSQL database in a containerized environment:

1. Open a terminal window in the project directory.
2. Run the command `docker compose up`.

This will start the application and the database. You can then explore the application's functionalities and interact with the database through the provided APIs or tools.

### Roadmap

Here's what we aim to achieve in this project:

* Set up a Spring Boot application with basic functionalities.
* Integrate Liquibase for database schema management.
* Persist data using Spring Data JPA.
* Leverage Docker for containerized application deployment.
* Utilize Testcontainers for automated testing with databases.

The project is in its initial stages, but there are exciting features planned for the future:

* Add additional modules showcasing advanced Spring Boot features.

This Readme provides a starting point for your exploration. 
Feel free to experiment, modify the code, and build something awesome!