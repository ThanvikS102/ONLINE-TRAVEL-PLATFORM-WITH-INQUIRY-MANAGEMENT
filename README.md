# Online Travel Platform with Inquiry Management

A Spring Boot–based web application that allows users to browse travel packages and enables admins to manage travel listings.  
Built using Java, Spring Boot, Thymeleaf, and MySQL.

---

## Tech Stack
- Java, Spring Boot
- HTML, CSS, Thymeleaf
- MySQL
- Maven

---

## Features
- View travel packages (From → To, price, duration)
- Admin dashboard to add/delete packages
- REST API for travel packages
- Clean MVC architecture

---

## How to Run the Project

### Prerequisites
- Java 17+
- Maven
- MySQL running

### Steps
1. Create database:
CREATE DATABASE travel_db;

2. Update `application.properties` with your MySQL credentials.

3. Run the project:
mvn clean
mvn spring-boot:run


4. Open browser:
http://localhost:8080

## URLs

* `/` → Home
* `/packages` → Travel packages
* `/admin` → Admin dashboard
* `/api/packages` → REST API

