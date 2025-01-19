* SQLite is a serverless database. It is a software library that provides a relational database management system. It is a self-contained, serverless, zero-configuration, transactional SQL database engine. SQLite is the most widely deployed database in the world with more applications than we can count, including several high-profile projects.


* SQLite is ACID compliant. ACID stands for Atomicity, Consistency, Isolation, Durability. It is a set of properties of database transactions intended to guarantee validity even in the event of errors, power failures, etc.

1. Atomicity - A transaction is a single unit of work. Either all of the transaction is completed or none of it is.
2. Consistency - A transaction must start in a consistent state and end in a consistent state.
3. Isolation - A transaction in progress and not yet committed must remain isolated from any other transaction.
4. Durability - Once a transaction has been committed, it will remain so, even in the event of power loss, crashes, etc.

.databases - lists all databases
.open {name}.db - opens a database and creates it if it doesn't exist
.tables - lists all tables in the database
.schema {table_name} - shows the schema of the table

DDL
1. CREATE
2. DROP
3. ALTER
4. TRUNCATE
5. RENAME

DML
1. INSERT
2. DELETE
3. UPDATE

Query
1. SELECT
2. FROM 
3. WHERE
4. GROUP BY
5. HAVING
6. ORDER BY
7. JOIN

DCL
1. GRANT
2. REVOKE

Datatypes of SQLite
1. NULL
2. INTEGER
3. REAL / FLOAT / NUMERIC
4. TEXT
5. CHAR / VARCHAR / VARYING CHARACTER
6. BLOB - Binary Large Object. Used to store binary data like images, videos, etc.


Aggregate Functions
1. COUNT
2. SUM
3. AVG
4. MIN
5. MAX

Set Operations
1. UNION - returns all the rows from the first result set and all the rows from the second result set. if there are duplicates, only one copy is returned.
2. UNION ALL - returns all the rows from the first result set and all the rows from the second result set. if there are duplicates, all copies are returned.
3. INTERSECT - returns the rows that are common in both the result sets.
4. EXCEPT - returns the rows that are in the first result set but not in the second result set.

JDBC - Java Database Connectivity
1. DriverManager - manages a list of database drivers. matches connection requests from the java application with the proper database driver using communication subprotocol. conversion of data types between SQL types and Java types.
2. Connection - interface with methods to connect and disconnect to a database.
3. Statement - interface with methods to execute SQL queries.
4. ResultSet - interface with methods to retrieve and update the results of a query.

Types of JDBC Drivers
Type 1: JDBC-ODBC Bridge Driver - uses ODBC driver to connect to the database.
Type 2: Native-API Driver - uses database-specific API to connect to the database.
Type 3: Network Protocol Driver - uses middleware to connect to the database. 
Type 4: Thin Driver - uses database-specific protocol to connect to the database. (directly communicates with the database)


ODBC - Open Database Connectivity - a standard API for accessing database management systems (DBMS). It is language-independent and provides a common interface for accessing data stored in various database management systems.

Database vs Database Management System vs Database System
1. Database - a collection of related data.
2. Database Management System - a software system that enables users to define, create, maintain, and control access to the database.
3. Database System - a combination of database and database management system.


1. Connection
2. Statement
3. ResultSet


types of statements
1. Statement - used to execute a simple SQL query.
2. PreparedStatement - used to execute a precompiled SQL query. 
3. CallableStatement - used to execute a stored procedure. you can store some code in the database and call it from the java application.