# SpringBoot-Microservice

## Problem Statement


### Objective: 
To create a simple CRUD microservice for updating the details of a trip to a database as per the requirement
Requirements:

### Requirements
The microservice should expose the basic REST APIs with which we will be able to update a database.

User validation to be done -> you can pass a username and password along with the header. Users can edit only their own trips.(We are trying to implement API Authentication)

Request body validation to be done for wherever needed. (Trying to add validation for the incoming request, this is needed only for operations like fetching a trip based on trip-id or delete a trip based on trip-id)

- Create 2 entity classes

  - User Table

  - Long UserId -> Primary Key

  - String Username

  - String Password

- Trips Table

  - Long Id -> Primary key
  - String UserId->Foreign Key
  - int TripId
  - String AckStatus
  - String BookingStatus
  - Double Price
  - Implement CRUD operations

* For saving a trip to db
* For updating a trip to db (if the trip belongs to the user requested)
* For fetching all trips from db
* To fetch a trip based on trip-id
* To delete a trip based on trip-id
* To delete all trips

+ Follow Controller, Service, DAO pattern. (Create separate folders for controller, service, model, repository and exception)

+ Implement Java8 features like Lambda, Streams, Method references, Optional Keyword etc. wherever possible.

Technologies : SpringBoot, Spring JPA, Database (H2/MySql)
