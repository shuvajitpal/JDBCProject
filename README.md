# JDBC & MySQL Integration Project
## What I Built
A simple Java application that connects to a MySQL database using JDBC and performs basic **CRUD operations**.  
The project demonstrates how to:
- Establish a database connection
- Insert multiple users with `PreparedStatement`
- Fetch data with `ResultSet`
- Close resources safely
## Why I Built It
I built this project to understand **how Java applications talk to databases** at a low level using JDBC.  
This gives me hands-on experience with:
- SQL commands in real applications  
- Preventing SQL injection using `PreparedStatement`  
- Managing database connections and resources properly  

## How It Works
1. **Database Setup**  
   - Create a database `testdb` in MySQL  
   - Create a table `user` with columns: `id`, `name`, `email`  

   ```sql
   CREATE DATABASE testdb;
   USE testdb;
   CREATE TABLE user (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(100) NOT NULL,
       email VARCHAR(100) UNIQUE NOT NULL
   );
