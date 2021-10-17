### RDBMS:
-	An RDBMS, or relational database management system, is the software that gives users the ability to update, query and administer a relational database. 
-	A Relational database management system (RDBMS) is a database management system (DBMS) that is based on the relational model as introduced by E. F. Codd.


### Keys:
It is important that any entity in an entity set be uniquely identifiable.  Practically, we use the values of certain attributes to uniquely identify an entity.  For example, when the clerk at a bank keys in a customer’s SSN, the customer’s full information can be brought up.  Also, if she keys in both SSN and the customer’s name, the same customer’s information will be brought up. 
#### Employee Table
| EmpID | EmpName | EmpAge | SSN | Passport_Number | License_Number |
| ------ | ------ |------ | ---- | ---- | ----- |
|1234 | Lay | 34 | 1645 | 7345 | 74721 |
|1235 | Ray | 32 | 464 | 9765 | 64647 |
#### Superkey
- Super key is a set of an attribute which can uniquely identify a tuple. Super key is a superset of a candidate key.
- ##### For example: 
  In the above EMPLOYEE table, for(EMPLOEE_ID, EMPLOYEE_NAME) the name of two employees can be the same, but their EMPLYEE_ID can't be the same. Hence, this combination can also be a key.
  The super key would be `EMPLOYEE-ID`,` (EMPLOYEE_ID, EMPLOYEE-NAME)`, etc.

#### Candidate key
-	A candidate key is an attribute or set of an attribute which can uniquely identify a tuple.
-	The remaining attributes except for primary key are considered as a candidate key. The candidate keys are as strong as the primary key.
- ##### For example: 
  In the EMPLOYEE table, id is best suited for the primary key. Rest of the attributes like `SSN`, `Passport_Number`, and `License_Number`, etc. are considered as a candidate key.

#### Primary key
- It is the first key which is used to identify one and only one instance of an entity uniquely. An entity can contain multiple keys as we saw in PERSON table. The key which is most suitable from those lists become a primary key.
-	In the EMPLOYEE table, `ID` can be primary key since it is unique for each employee. In the EMPLOYEE table, we can even select License_Number and Passport_Number as primary key since they are also unique.
-	For each entity, selection of the primary key is based on requirement and developers.

#### Foreign key
-	Foreign keys are the column of the table which is used to point to the primary key of another table.
-	In a company, every employee works in a specific department, and employee and department are two different entities. So we can't store the information of the department in the employee table. That's why we link these two tables through the primary key of one table.
-	We add the primary key of the DEPARTMENT table, Department_Id as a new attribute in the EMPLOYEE table.
-	Now in the EMPLOYEE table, `Department_Id` is the foreign key, and both the tables are related.

#### Composite key
-	A 'combination of two or more' better describes the word 'composite'. Thus, a composite key in DBMS is a candidate key that is composed of two or more attributes and is capable of uniquely identifying a table or a relation.
-	A composite key is the DBMS key having two or more attributes that together can uniquely identify a tuple in a table. Such a key is also known as Compound Key, where each attribute creating a key is a foreign key in its own right.

### Dependencies in DBMS:
It is a relation between two or more attributes.
It has the following types in DBMS :
-	*Functional Dependency*
    - If the information stored in a table can uniquely determine another information in the same table, then it is called Functional Dependency. Consider it as an association between two attributes of the same relation.
    - Ex., EmpName is functionally dependent on EmpID because EmpName can take only one value for the given value of EmpID:
EmpID -> EmpName

-	*Fully-Functional Dependency*
    - An attribute is fully functional dependent on another attribute, if it is Functionally Dependent on that attribute and not on any of its proper subset.
    - For example, an attribute Q is fully functional dependent on another attribute P, if it is Functionally Dependent on P and not on any of the proper subset of P.

-	*Partial Dependency*
     - Partial Dependency occurs when a nonprime attribute is functionally dependent on part of a candidate key.
     - The 2nd Normal Form (2NF) eliminates the Partial Dependency. 

-	*Transitive Dependency*
    - When an indirect relationship causes functional dependency it is called Transitive Dependency.
    - If  P -> Q and Q -> R is true, then P-> R is a transitive dependency.

-	*Multivalued Dependency*
    - When existence of one or more rows in a table implies one or more other rows in the same table, then the Multi-valued dependencies occur.
    - If a table has attributes P, Q and R, then Q and R are multi-valued facts of P.
### Normalization:

| Normal Form | Requirement |
| ------ | ------ |
| 1NF |  Contains an atomic value |
| 2NF |  Should be in 1NF and all non-key attributes are fully functional dependent on the primary key |
| 3NF |  Should be in 2NF and no transition dependency exists |
| 4NF |  Should be in Boyce Codd normal form and has no multi-valued dependency|
| 5NF |  Should be 4NF and should not contain any join dependency and joining should be lossless |


### DDL (Data Definition Language): 
DDL consists of the SQL commands that can be used to define the database schema. It deals with descriptions of the database schema and is used to create and modify the structure of database objects in the database.
DDL is a set of SQL commands used to create, modify, and delete database structures but not data. 

List of DDL commands: 
-	**CREATE**: This command is used to create the database or its objects (like table, index, function, views, store procedure, and triggers).
-	**DROP**: This command is used to delete objects from the database.
-	**ALTER**: This is used to alter the structure of the database.
-	**TRUNCATE**: This is used to remove all records from a table, including all spaces allocated for the records are removed.
-	**COMMENT**: This is used to add comments to the data dictionary.
-	**RENAME**: This is used to rename an object existing in the database.

### DQL (Data Query Language):
DQL statements are used for performing queries on the data within schema objects. The purpose of the DQL Command is to get some schema relation based on the query passed to it. It includes the SELECT statement. This command allows getting the data out of the database to perform operations with it.

List of DQL commands:: 
-	**SELECT**: It is used to retrieve data from the database.
