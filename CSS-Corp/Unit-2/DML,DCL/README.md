
### DML(Data Manipulation Language): 
The SQL commands are used for the manipulation of data present in the database belong to Data Manipulation Language and this includes most of the SQL statements. It controls access to data and to the database. Basically, DCL statements are grouped with DML statements.

List of DML commands: 
-	INSERT : It is used to insert data into a table.
-	UPDATE: It is used to update existing data within a table.
-	DELETE : It is used to delete records from a database table.
-	LOCK: Table control concurrency.
-	CALL: Call a PL/SQL or JAVA subprogram.
-	EXPLAIN PLAN: It describes the access path to data.


###  DCL (Data Control Language): 
DCL includes commands such as GRANT and REVOKE which mainly deal with the rights, permissions, and other controls of the database system. 

List of  DCL commands: 
-	GRANT: This command gives users access privileges to the database.
-	REVOKE: This command withdraws the user’s access privileges given by using the GRANT command.


###  TCL (Transaction Control Language):
TCL commands deal with the transaction within the database. 

List of TCL commands: 

-	COMMIT: Commits a Transaction.
-	ROLLBACK: Rollbacks a transaction in case of any error occurs.
-	SAVEPOINT: Sets a savepoint within a transaction.
-	SET TRANSACTION: Specify characteristics for the transaction.

### ORDER BY Keyword
- The ORDER BY keyword is used to sort the result-set in ascending or descending order.
- The ORDER BY keyword sorts the records in ascending order by default. To sort the records in descending order, use the DESC keyword.

##### ORDER BY Syntax
SELECT column1, column2, ...
FROM table_name
ORDER BY column1, column2, ... ASC|DESC;

### SELECT DISTINCT Statement
- The SELECT DISTINCT statement is used to return only distinct (different) values.
- Inside a table, a column often contains many duplicate values; and sometimes you only want to list the different (distinct) values.

##### SELECT DISTINCT Syntax
SELECT DISTINCT column1, column2, ...
FROM table_name;

### LIKE Operator
- The LIKE operator is used in a WHERE clause to search for a specified pattern in a column.
- There are two wildcards often used in conjunction with the LIKE operator:
   - The percent sign (%) represents zero, one, or multiple characters
   - The underscore sign (_) represents one, single character
##### LIKE Syntax
SELECT column1, column2, ...
FROM table_name
WHERE columnN LIKE pattern;

### COUNT() Function
- The COUNT() function returns the number of rows that matches a specified criterion.

##### COUNT() Syntax
SELECT COUNT(column_name)
FROM table_name
WHERE condition;

### AVG() Function
- The AVG() function returns the average value of a numeric column. 

##### AVG() Syntax
SELECT AVG(column_name)
FROM table_name
WHERE condition;

### SUM() Function
- The SUM() function returns the total sum of a numeric column. 

##### SUM() Syntax
SELECT SUM(column_name)
FROM table_name
WHERE condition;

