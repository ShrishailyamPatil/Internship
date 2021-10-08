# Java

   Java is a popular programming language, created in 1995.
It is owned by Oracle, and more than 3 billion devices run Java. Java was developed by James Gosling, who is known as the father of Java, in 1995.

  Java language was initially called Oak after an oak tree that stood outside Gosling's office. Later the project went by the name Green and was finally renamed Java, from Java coffee, a type of coffee from Indonesia.

## Multiple Editions
- Java Card for smartcards.

- Java Platform, Micro Edition (Java ME) — targeting environments with limited resources.

- Java Platform, Standard Edition (Java SE) — targeting workstation environments.

- Java Platform, Enterprise Edition (Java EE) — targeting large distributed enterprise or
Internet environments.

## Features of Java


| **Simple** | **Object-Oriented** | **Portable** | **Distributed** |
| :---: | :---: | :---: | :---: |
| **Platform independent** | **Secured** | **Robust** | **Dynamic** | 
| **Architecture neutral** | **Interpreted** | **High Performance** | **Multithreaded** | 

## JDK, JRE, JVM 
  - JDK :  Java Development Kit
  - JRE : Java Runtime Enviroment
  - JVM : Java Virtual Machine
  
  
  ![](https://static.javatpoint.com/images/jdk2.png)
  
## Lifecycle of java program
- Edit 
    - Programmers write the code.
- Complie
    - Compiler creates byte code(.class) from java program.
- Load 
    - Class loader stores byte code in memory and loads necessary data .
- Execute 
    - Interpreter translates byte code into machine language 

## OOPS Concept

- Encapsulation 
    -Encapsulation in Java is a process of wrapping code and data together into a single unit, to achive data hiding
- Abstraction
   - Abstraction is a process of hiding the implementation details and showing only functionality to the user.
- Polymorphism
   -  Complie time polymorphism (Over Loading)
        - Happens in same class
   -  Runtime Dispatch (Overrinding)
        -  Happens in parent class and subclass.
- Inheritance
   - Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.


## Access Modifiers

The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class.We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.

The four access modifiers are private, default, protected, public.


| Access Modifiers | Same Class | Same Package | Subclass outside package | Global(all project) |
| :---: | :---: | :---: | :---: | :---: |
| Private | YES | NO | NO | NO |
| Default | YES  | YES | NO | NO |
| protected | YES | YES | YES | NO |
| Public | YES | YES | YES | YES |


## Data Types

| Data Type | Size(bits)| Range | Default Value  |
| :---: | :---: | :---: | :---: |
| byte | 8 | -2<sup>7</sup> to -2<sup>7</sup> -1  | 0 | 
| short | 16  | -2<sup>15</sup> to -2<sup>15</sup> -1  | 0 | 
| int | 32 | -2<sup>31</sup> to -2<sup>31</sup> -1 | 0 | 
| long | 64 | -2<sup>63</sup> to -2<sup>63</sup> -1 | 0L | 
| float | 32 | -2<sup>31</sup> to -2<sup>31</sup> -1  | 0.0f | 
| double | 64 | -2<sup>63</sup> to -2<sup>63</sup> -1 | 0.0d | 
| char | 16 | 0 to -2<sup>16</sup> -1 | \u0000 |
| boolean | 1 | true or false | false | 
