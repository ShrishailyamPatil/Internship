

## SQL Clauses
### 1. GROUP BY
- SQL GROUP BY statement is used to arrange identical data into groups. The GROUP BY statement is used with the SQL SELECT statement.
- The GROUP BY statement follows the WHERE clause in a SELECT statement and precedes the ORDER BY clause.
- The GROUP BY statement is used with aggregation function.

#### Syntax
```sql
SELECT column  
FROM table_name  
WHERE conditions   
GROUP BY column  
ORDER BY column  
```

### 2. HAVING
- HAVING clause is used to specify a search condition for a group or an aggregate.
- Having is used in a GROUP BY clause. If you are not using GROUP BY clause then you can use HAVING function like a WHERE clause.
#### Syntax:
```sql
SELECT column1, column2   
FROM table_name  
WHERE conditions   
GROUP BY column1, column2   
HAVING conditions  
ORDER BY column1, column2;  
```
### 3. ORDER BY
- The ORDER BY clause sorts the result-set in ascending or descending order.
- It sorts the records in ascending order by default. DESC keyword is used to sort the records in descending order.
#### Syntax:
```sql
SELECT column1, column2  
FROM table_name  
WHERE condition  
ORDER BY column1, column2... ASC|DESC;  
```
Where
 **ASC:** It is used to sort the result set in ascending order by expression.
**DESC:** It sorts the result set in descending order by expression.

## SQL Aggregate Functions
- SQL aggregation function is used to perform the calculations on multiple rows of a single column of a table. It returns a single value.
- It is also used to summarize the data.

### Types of SQL Aggregation Function
### 1. COUNT() Function
- The COUNT() function returns the number of rows that matches a specified criterion.

#### COUNT() Syntax
```sql
SELECT COUNT(column_name)
FROM table_name
WHERE condition;
```
### 2. AVG() Function
- The AVG() function returns the average value of a numeric column. 

#### AVG() Syntax
```sql
SELECT AVG(column_name)
FROM table_name
WHERE condition;
```
### 3. SUM() Function
- The SUM() function returns the total sum of a numeric column. 

#### SUM() Syntax
```sql
SELECT SUM(column_name)
FROM table_name
WHERE condition;
```
### 4. MAX Function
- MAX function is used to find the maximum value of a certain column. 
- This function determines the largest value of all selected values of a column.

#### MAX() Syntax
```sql
MAX()  
or  
MAX( [ALL|DISTINCT] expression )  
```
### 5. MIN() Function
- MIN function is used to find the minimum value of a certain column.
- This function determines the smallest value of all selected values of a column.

#### MIN() Syntax
```sql
MIN()  
or  
MIN( [ALL|DISTINCT] expression )  
```
