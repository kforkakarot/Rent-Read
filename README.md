# Rent-Read
Backend for book rentals, implementing API for CRUD of books by admin, also the user can register and login and rent books. JWT based Authn and Authz using spring security 

Please check the Main application class to find default entities that get created when the application is started.
I have disbaled to create the Admin role user since it does not seem secure

#Setting Up java

1)Refer to the below document for easy installation https://www3.cs.stonybrook.edu/~amione/CSE114_Course/materials/resources/InstallingJava17.pdf

#Setting Up MySQL
Refer to teh following document to install and setting up MYSQL on windows mac and linux

https://dev.mysql.com/doc/mysql-getting-started/en/

#Setting up the environment
Configure the following lines into your application.properties file

server.port=8080
spring.datasource.url=jdbc:mysql://localhost:3306/YOUR_DATABASE_NAME
spring.datasource.username=YOUR_DATABASE_USERNAME
spring.datasource.password=YOUR_DATABASE_PASSWORD
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver

spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true



