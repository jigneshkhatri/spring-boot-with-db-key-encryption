# spring-boot-with-db-key-encryption
Demo Spring boot project which depicts encryption of database keys with attribute JPA converters

### Libraries used:
* Spring boot
* Spring data JPA and Hibernate
* Liquibase (for database management)

### How to run this project:
To run the project, open the command-line at the project's root directory, and run this command: **mvnw spring-boot:run**. It will automatically create the database, required tables, and insert preliminary data.

### Endpoints of interest:
* _http://localhost:8080/demoAPI/user_
  * To save the data
  * Method: **POST**
  * Content-Type: **application/json**
  * Body: 
  * { "name": "Jignesh Khatri", "email": "test@test.com", "contactNumber": "1234567890", "password": "123456" }
* _http://localhost:8080/demoAPI/user_
  * To retrive all data
  * Method: **GET**
  * Content-Type: **application/json**
